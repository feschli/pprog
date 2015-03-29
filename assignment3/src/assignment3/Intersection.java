package assignment3;

public class Intersection {
	
	private final Sphere sphere;
	private final double t;

	public Intersection(Sphere sphere, double t) {
		super();
		this.sphere = sphere;
		this.t = t;
	}

	public Sphere getSphere() {
		return sphere;
	}

	public double getT() {
		return t;
	}

	@Override
	public String toString() {
		return "Intersection [sphere=" + sphere + ", t=" + t + "]";
	}

}

