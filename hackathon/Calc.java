class Calc {
    double a;
    double b;
    String opp;

    public Calc() {
    }

    public Calc(double a, String opp, double b) {
        this.a = a;
        this.b = b;
    }

    public static double together(double a, String opp, double b){
        double sum = 0.0;
        if (opp == "+") {
            sum = a + b;
        }
        else if (opp == "-") {
            sum = a - b;
        }
        else if (opp == "*") {
            sum = a * b;
        }
        else if (opp == "/") {
            sum = a / b;
        }else {
            System.out.println("Error: did not put correct opp");
        }
        return sum;
    }

    
}