package assignment3;

public class Ray {
	private final Vector start;
	private final Vector direction;
	
	// Implement class Ray according to the exercise sheet!
	public Ray(Vector origin, Vector direction) {
		// TODO
		super();
		this.start = origin;
		this.direction = direction;
		
		//if(direction!=Vector.VEC_ZERO){
		//this.direction = direction;}
	}
	
	public Vector getStart(){
		return start;
	}
	
	public Vector getDirection(){
		return direction;
	}
}