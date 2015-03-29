package assignment3;

public class Sphere {

	private final Vector color;
	private final Vector emission;
	private final Vector position;
	private final double radius;

	public Sphere(double radius, Vector position, Vector color, Vector emission) {
		super();
		this.position = position;
		this.radius = radius;
		this.color = color;
		this.emission = emission;
	}

	public Vector getColor() {
		return color;
	}

	public Vector getEmission() {
		return emission;
	}

	public Vector getNormal(final Vector at) {
		return at.minus(this.getPosition());
	}

	public Vector getPosition() {
		return position;
	}

	public double getRadius() {
		return radius;
	}

	public double intersect(final Ray ray) {
		final double eps = 1e-4;
		Vector op = this.getPosition().minus(ray.getOrigin());
		double b = op.dot(ray.getDirection());
		double det = b * b - op.dot(op) + radius * radius;

		if (det < 0.0) {
			return Double.NaN;
		} else {
			det = Math.sqrt(det);
		}

		// eps avoids self-intersection when ray starts on sphere
		if (b - det > eps) {
			return b - det;
		}

		if (b + det > eps) {
			return b + det;
		}

		return Double.NaN;
	}

	@Override
	public String toString() {
		return "Shape [position=" + position + ", radius=" + radius
				+ ", color=" + color + ", emission=" + emission + "]";
	}

}
