public class NegativeRadiusException extends CircleException {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    private double radius;
    public NegativeRadiusException(double r) {
        super("negative radius");
        this.radius = r;
    }


    public double radius() {
        return radius;
    }


}
