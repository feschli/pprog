package assignment4;

public class MyThread extends Thread {
	
	int xstart;
	int planeHeight, planeWidth;
	int samples;
	Scene s;
	
	
	public MyThread(Scene s, int xstart,int planeWidth, int planeHeight, int samples){
		this.planeHeight = planeHeight;
		this.planeWidth = planeWidth;
		this.xstart = xstart;
		this.samples = samples;
		this.s = s;
	}
	
	public void run(){
		for (int j = 0; j < planeHeight; j++) {
			if ((j % 10) == 0) {
				System.out.print(".");
			}
			
			for (int i = 0; i < planeWidth; i++) {
				Ray ray = getCameraRay(i, j);

				Vector r = Vector.VEC_ZERO;
				for (int s = 0; s < samples; s++) {
					r = r.plus(getLight(ray, 0));
				}

				image.setRGB(i, planeHeight - j - 1,
						r.smult(1. / samples).toRGB());
			}
		}
	}

}
