package assignment3;

public class Camera {
	// Implement
	
	private Ray eye;
	Vector up;

	public Camera(Ray eye, Vector up) {
		// Implement
		this.eye = eye;
		this.up = up;
	}
	
	public Ray getEye(){
		return eye;
	}
	
	public Vector getUp(){
		return up;
	}

}
