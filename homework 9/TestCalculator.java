public class TestCalculator{
    public static void main(String[] args) {
        Calculator c = new AdvancedCalculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2.5, 3.5));
    }
}