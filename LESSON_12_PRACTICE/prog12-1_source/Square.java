public class Square extends ClosedCurve {
	double side;

	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}

	public Square(double side) throws IllegalClosedCurveException {
		if (side <= 0)
			throw new IllegalClosedCurveException("Side must be positive.");
		this.side = side;
	}

	double computeArea() {
		return (side * side);
	}

}
