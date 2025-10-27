
// Parent class
class Animal{
    public void makeSound(){
        System.out.println("The animle makes a sound");
    }
}

// Chiled class
class Dog extends Animal{
    // Overrides
    // This is POLYMORPHISM and inherits from animal
    @Override
    public void makeSound(){
        System.out.println("The dog barks: woof");
    };
}
// Chiled class
class Cat extends Animal{
    // Overrides
    // This is POLYMORPHISM and inherits from animal
    @Override
    public void makeSound(){
        System.out.println("The cat barks: meow");
    };
}