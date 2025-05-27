// Lab submission: Greta Gamble, Arjan Ellingson, Ross Poletti
public class CircleTest {
    public static void main(String[] args) {
        try {
            //Circle c1 = new Circle(-4);
            //System.out.println(c1);
            //Circle c2 = new Circle(0);
            //System.out.println(c2);
            Circle c3 = new Circle(5);
            System.out.println(c3);

        } catch (NegativeRadiusException n) {
            System.out.println(n.getMessage());
            System.out.println(n.radius());
        } catch (ZeroRadiusException e) { // only print radius for negative, not zero
            System.out.println(e.getMessage());

        } finally {
            System.out.println("In finally.");
        }
        System.out.println("Done.");
    }
}

