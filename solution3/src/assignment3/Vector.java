package assignment3;

public class Vector {

	public static final Vector VEC_ZERO = new Vector(0, 0, 0);

	private static double clamp(double value, double min, double max) {
		double d = value;
		if (d < min) {
			d = min;
		} else if (d > max) {
			d = max;
		}
		return d;
	}

	private final double x, y, z;

	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Vector)) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        Vector o = (Vector) obj;
        return ((x == o.getX()) && (y == o.getY()) && (z == o.getZ()));
    }

	public Vector cross(Vector o) {
		return new Vector(y * o.z - z * o.y, z * o.x - x * o.z, x * o.y - y
				* o.x);
	}

	public double dot(Vector r) {
		return x * r.x + y * r.y + z * r.z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public Vector minus(Vector o) {
		return new Vector(x - o.x, y - o.y, z - o.z);
	}

	public Vector mul(Vector o) {
		return new Vector(x * o.x, y * o.y, z * o.z);
	}

	public double norm() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public Vector normalize() {
		final double inorm = 1. / this.norm();
		return smult(inorm);
	}

	public Vector plus(Vector r) {
		return new Vector(x + r.x, y + r.y, z + r.z);
	}

	public Vector smult(double f) {
		return new Vector(f * x, f * y, f * z);
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
