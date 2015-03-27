package assignment2;

public class Sphere {
	// Implement class Sphere according to the exercise sheet!
	private final Vector v;
	private final double d;
	private final Vector color;

	public Sphere(double radius, Vector center, Vector color) {
		// TODO
		this.v = center;
		this.d = radius;
		this.color = color;
	}

	public Vector getColor() {
		// TODO
		return color;
	}

	public Vector getPosition() {
		return v;
	}

	public double getRadius() {
		return d;
	}

//	public double intersect(Ray r) {
//		// TODO
//		Vector w = r.start.minus(this.v);
//		double t1, t2, d;
//
//		d = w.dot(r.direction) * w.dot(r.direction) - w.dot(w) + this.d
//				* this.d;
//
//		t1 = -w.dot(r.direction) + Math.sqrt(d);
//		t2 = -w.dot(r.direction) - Math.sqrt(d);
//
//		if (d < 0.0) {
//			return Double.NaN;
//		} else if (t1 > 0.0 && t2 > 0.0) {
//			if (t1 >= t2) {
//				return t2;
//			} else {
//				return t1;
//			}
//		}
//
//		else if (t1 > 0.0 && t2 < 0.0) {
//			return t1;
//		} else if (t1 < 0.0 && t2 > 0.0) {
//			return t2;
//		} else {
//			return Double.NaN;
//		}
//
//		/*
//		 * final double eps = 1e-4; Vector op =
//		 * this.getPosition().minus(r.start); double b = op.dot(r.direction);
//		 * double d = b * b - op.dot(op) + this.d * this.d;
//		 * 
//		 * if (d < 0.0) { return Double.NaN; } else { d = Math.sqrt(d); }
//		 * 
//		 * if (b - d > eps) { return b - d; }
//		 * 
//		 * if (b + d > eps) { return b + d; }
//		 * 
//		 * return Double.NaN;
//		 */
//
//	}
	
	public double intersect(Ray ray) {
		double t1, t2;
		Vector v = ray.start.minus(this.v);
		double diskriminant = Math.pow(v.dot(ray.direction), 2)
				- v.dot(v) + Math.pow(this.d, 2);

		if (diskriminant < 0) {
			return Double.NaN;
		} else
			diskriminant = Math.sqrt(diskriminant);

		t1 = -(v.dot(ray.direction)) + diskriminant;
		t2 = -(v.dot(ray.direction)) - diskriminant;

		if (t1 < 0 && t2 < 0) {
			return Double.NaN;
		} else if (t1 <= t2) {
			return t1;
		} else {
			return t2;
		}

	}

}
