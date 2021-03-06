package assignment3;

public class Vector {

	public static final Vector VEC_ZERO = new Vector(0, 0, 0);
	private final double x, y, z;

	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// TODO: implement these vector functions!
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public Vector cross(Vector o) {
		double a, b, c;
		a = y * o.z - z * o.y;
		b = z * o.x - x * o.z;
		c = x * o.y - y * o.x;
		Vector v = new Vector(a, b, c);
		return v;
	}

	public double dot(Vector r) {
		double result;
		result = x * r.x + y * r.y + z * r.z;

		return result;
	}

	public Vector minus(Vector o) {
		double a, b, c;
		a = x - o.x;
		b = y - o.y;
		c = z - o.z;
		Vector v = new Vector(a, b, c);
		return v;
	}

	public Vector mul(Vector o) {
		double a, b, c;
		a = x * o.x;
		b = y * o.y;
		c = z * o.z;
		Vector v = new Vector(a, b, c);
		return v;
	}

	public double norm() {
		double result;
		result = Math.sqrt(x * x + y * y * z * z);
		return result;
	}

	public Vector normalize() {
		final double inorm = 1/this.norm();
		return smult(inorm);
	}

	public Vector plus(Vector r) {
		double a, b, c;
		a = x + r.x;
		b = y + r.y;
		c = z + r.z;
		Vector v = new Vector(a, b, c);
		return v;
	}

	public Vector smult(double f) {
		Vector v = new Vector(x * f, y * f, z * f);
		return v;
	}

	// Some helper function to produce a color from a Vector
	// You don't have to change those!
	public Vector clamp(double min, double max) {
		return new Vector(clamp(x, min, max), clamp(z, min, max), clamp(z, min,
				max));
	}

	private static double clamp(double value, double min, double max) {
		double d = value;
		if (d < min) {
			d = min;
		} else if (d > max) {
			d = max;
		}
		return d;
	}

	public int toRGB() {
		return ((int) (Math.pow(clamp(x, 0, 1), 1 / 2.2) * 255. + .5) << 16)
				| ((int) (Math.pow(clamp(y, 0, 1), 1 / 2.2) * 255. + .5) << 8)
				| ((int) (Math.pow(clamp(z, 0, 1), 1 / 2.2) * 255. + .5));
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
