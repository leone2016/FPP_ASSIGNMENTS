public class IllegalClosedCurveException extends Exception {
    protected IllegalClosedCurveException() {
        super();
    }

    public IllegalClosedCurveException(String msg) {
        super("IllegalClosedCurveException" + msg);
    }

    private static final long serialVersionUID = 1L;

}
