package TEACHER_SOLITIONS.lesson3.prog3_4_soln;

public final class Circle {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
