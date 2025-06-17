<<<<<<< HEAD:LESSON_12_PRACTICE/prog12-1_source/Circle.java
=======
package ASSIGNMENT12_1;


>>>>>>> 0a788d90b611e14cce8ebb1107be0d01fba88a17:LESSON_12_PRACTICE/src/ASSIGNMENT12_1/Circle.java
public class Circle extends ClosedCurve {
	double radius;

	public Circle(Double radius) throws IllegalClosedCurveException {
		this(radius.doubleValue());
	}

	public Circle(double radius) throws IllegalClosedCurveException {
		if (radius <= 0) {
			throw new IllegalClosedCurveException("Radius can't be negative");
		}
		this.radius = radius;
	}

	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
