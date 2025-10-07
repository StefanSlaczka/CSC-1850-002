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
        if (opp.equals("+")) {
            sum = a + b;
        }
        else if (opp.equals("-")) {
            sum = a - b;
        }
        else if (opp.equals("*")) {
            sum = a * b;
        }
        else if (opp.equals("/")) {
            if(b == 0){
                System.out.println("can't divide by 0");
            }
            sum = a / b;
        }else {
            System.out.println("Error: did not put correct opp");
        }
        return sum;
    }

    
}