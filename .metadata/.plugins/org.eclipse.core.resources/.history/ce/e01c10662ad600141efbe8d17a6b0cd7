package assignment3;

public class Ray {

	private final Vector direction;
	private final Vector origin;

	public Ray(Vector origin, Vector direction) {
		super();
		// direction must be non-zero
		if (Vector.VEC_ZERO.equals(direction)) {
			throw new IllegalArgumentException(
					"Invalid length of direction vector");
		}
		this.origin = origin;
		this.direction = direction.normalize();
	}

	public Vector getDirection() {
		return direction;
	}

	public Vector getOrigin() {
		return origin;
	}

	@Override
	public String toString() {
		return "Ray [origin=" + origin + ", direction=" + direction + "]";
	}

}
