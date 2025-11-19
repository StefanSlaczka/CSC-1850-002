public class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Hello from the inner class");
        }
    }

    public static void main(String[] args){
        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}