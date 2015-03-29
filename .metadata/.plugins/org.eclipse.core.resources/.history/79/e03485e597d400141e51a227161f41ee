package assignment3;

import java.awt.image.BufferedImage;
import java.util.Set;

public class Scene {
	// Implement

	Camera camera;
	int imageWidth;
	int imageHeight;
	Set<Sphere> spheres;

	public Scene(Camera camera, int imageWidth, int imageHeight) {
		// Implement
		this.camera = camera;
		this.imageHeight = imageHeight;
		this.imageWidth = imageWidth;
	}

	public void addSphere(Sphere sphere) {
		// Implement
		spheres.add(sphere);
	}

	/**
	 * Get the closest {@link Sphere} that intersects with the given ray.
	 * 
	 * @param ray
	 *            The ray to shoot at shapes.
	 * @return An {@link Intersection} object to store shape and distance or
	 *         <code>null</code> if no intersection has been found.
	 */
	public Intersection intersect(Ray ray) {
		// Implement
		Sphere s0 = null;
		double t0 = Double.MAX_VALUE;

		for (Sphere sphere : spheres) {
			double t = sphere.intersect(ray);
			if (sphere.intersect(ray) == t && t < t0) {
				s0 = sphere;
				t0 = t;
			}
		}

		return new Intersection(s0, t0);
	}

	/**
	 * Get a ray from the camera through pixels identified by <code>i</code> and
	 * <code>j</code>.
	 * 
	 * @param i
	 *            The pixel (0-based) on the width of the picture.
	 * @param j
	 *            The pixel (0-based) on the height of the picture.
	 * @return A new ray from the camera through the pixel.
	 */
	public Ray getCameraRay(int i, int j) {
		// Implement
		Vector u, v, w, a, b, c, s, e;
		final Vector zero = new Vector (0,0,0);
		double wid, hei;
		
		w = zero.minus((camera.getEye().direction)).normalize();
		
		wid = 1.0*i/imageWidth;
		hei = 1.0 * j/imageHeight;
		
		return null;
	}

	/**
	 * Compute the light at some ray. Performs intersection tests and recursive
	 * sampling of up to {@link #MAX_DEPTH} ({@value #MAX_DEPTH}) levels.
	 * 
	 * @param ray
	 *            The ray to compute the light for.
	 * @param depth
	 *            The current recursion depth.
	 * @return The color encoded as vector.
	 */
	public Vector getLight(Ray ray, int depth) {
		// Implement
		return null;
	}

	public void raytrace(final BufferedImage image, final int samples) {
		// Implement
	}
}
