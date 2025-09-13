// From Stefan Slaczka

public class main {
    public static void main(String[] args) {
        // making polynomail
        Polynomial p1 = new Polynomial(1, -2, -1);
        Polynomial p2 = new Polynomial(2, 3, 4);

        // using the methods and then seeing if they output fine
        p1.printP();
        System.out.println("p1(2) = " + p1.evalP(2));

        p1.addP(p2);
         // now prints new polynomial after addition on a,b,c
        p1.printP();
    }
}
