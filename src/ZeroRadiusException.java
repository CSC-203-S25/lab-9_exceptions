public class ZeroRadiusException extends CircleException {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public ZeroRadiusException() {
        super("zero radius");
    }
}
