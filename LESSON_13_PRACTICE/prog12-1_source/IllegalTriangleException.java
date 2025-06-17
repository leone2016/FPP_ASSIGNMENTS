public class IllegalTriangleException extends IllegalClosedCurveException {

    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(String msg) {
        super("IllegalTriangleException thrown: " + msg);
    }

    private static final long serialVersionUID = 1L;
}
