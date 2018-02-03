package by.kurlovich.cone.entity;

import java.io.Serializable;

public class Cone implements Serializable {
	private static final long serialVersionUID = 1L;
	private int coneId;
	private Point top;
	private Point base;
	private double radius;

	public Cone(int id, Point top, Point base, double radius) {
		this.coneId = id;
		this.top = top;
		this.base = base;
		this.radius = radius;
	}

	public int getConeId() {
		return coneId;
	}

	public void setConeId(int coneId) {
		this.coneId = coneId;
	}

	public Point getTop() {
		return top;
	}

	public void setTop(Point top) {
		this.top = top;
	}

	public Point getBase() {
		return base;
	}

	public void setBase(Point base) {
		this.base = base;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + coneId;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((top == null) ? 0 : top.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cone other = (Cone) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (coneId != other.coneId)
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		if (top == null) {
			if (other.top != null)
				return false;
		} else if (!top.equals(other.top))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cone [coneId=" + coneId + ", top=" + top + ", base=" + base + ", radius=" + radius + "]";
	}
}
