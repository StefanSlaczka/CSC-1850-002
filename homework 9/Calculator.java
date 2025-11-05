class Calculator {
    // Overloading methods
    int add(int a, int b) {
        return a + b;
    }
    double add( double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator{
    @Override
    int add(int a, int b){
        System.out.println("Adding in AdvancedCalculator");
        return a + b;
    }
}