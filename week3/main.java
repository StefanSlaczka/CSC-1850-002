class main{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.err.println("Get c1 area"+c1.getArea());

        Circle c2 = new Circle(10,10,10);
        System.err.println("Get c2 area"+c2.getArea());
    }
}