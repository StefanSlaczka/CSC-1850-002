class Test{
    public static void main(String[] args) {
        //INHERITANCE
        Dog dog = new Dog();
        Cat cat = new Cat();

        // POLYMORPHISM
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // DYNAMIC BINDING

        System.out.println("Demonstrating Dynamic Binding");

        a1.makeSound();
        a2.makeSound();

        System.out.println("Demonstrating Inheritance and Polymorphism");

        dog.makeSound();
        cat.makeSound();
    }
}