<<<<<<< HEAD:LESSON_12_PRACTICE/prog12-1_source/Rectangle.java
=======
package ASSIGNMENT12_1;

>>>>>>> 0a788d90b611e14cce8ebb1107be0d01fba88a17:LESSON_12_PRACTICE/src/ASSIGNMENT12_1/Rectangle.java
public class Rectangle extends ClosedCurve {

	private double width;
	private double length;

	public Rectangle(double width, double length) throws IllegalClosedCurveException {
		if (width <= 0 || length <= 0) {
			throw new IllegalClosedCurveException("Width and height must be positive.");
		}

		this.length = length;
		this.width = width;
	}

	double computeArea() {
		return width * length;
	}

}
