package assignment2;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

public class Raycaster {

	public static void main(String[] args) {
		new Raycaster().testRayCaster();
	}

	@Test
	public void testRayCaster() {
		final int width = 512;
		final int height = 512;

		final BufferedImage image = new BufferedImage(width, height,
				ColorSpace.TYPE_RGB);

		long nanos = System.nanoTime();
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				Sphere s1 = new Sphere(150, new Vector(300, 200, -1000), new Vector(0.75, 0.75, 0.75));
				Sphere s2 = new Sphere(150, new Vector(212, 284, -1000), new Vector(0.25, 0.25, 0.25));
				
				final Ray direction = new Ray(new Vector(i, j, 0), new Vector(0, 0, -1));
				final double d1 = s1.intersect(direction);
				final double d2 = s2.intersect(direction);

				if (Double.isNaN(d2) && Double.isNaN(d1)) {
					// Missed both Shapes
					image.setRGB(i, j, new Vector(0.5,0.5,0.5).toRGB());
				}
				else if(d1 < d2 || Double.isNaN(d2)) {
					// hit s1
					image.setRGB(i, j, s1.getColor().toRGB());
				}
				else if(d2 < d1 || Double.isNaN(d1)) {
					// hit s2
					image.setRGB(i, j, s2.getColor().toRGB());
				}
			}
		}
		System.out.println("Duration [ms]: " + (System.nanoTime() - nanos) / 1000);

		try {
			ImageIO.write(image, "PNG", new File("raytrace.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
