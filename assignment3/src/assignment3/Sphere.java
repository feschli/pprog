package assignment3;

public class Sphere {
	// Implement

	Vector position;
	double radius;
	Vector color;
	Vector emission;

	public Sphere(double radius, Vector position, Vector color, Vector emission) {
		// Implement
		this.position = position;
		this.radius = radius;
		this.color = color;
		this.emission = emission;

	}

	public double intersect(Ray ray) {
		double t1, t2;
		Vector v = ray.start.minus(this.position);
		double diskriminant = Math.pow(v.dot(ray.direction), 2)
				- v.dot(v) + Math.pow(this.radius, 2);

		if (diskriminant < 0) {
			return Double.NaN;
		} else
			diskriminant = Math.sqrt(diskriminant);

		t1 = -(v.dot(ray.direction)) + diskriminant;
		t2 = -(v.dot(ray.direction)) - diskriminant;

		if (t1 < 0 && t2 < 0) {
			return Double.NaN;
		} else if (t1 >= t2) {
			return t1;
		} else {
			return t2;
		}

	}

}