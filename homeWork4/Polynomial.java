// From Stefan Slaczka

class Polynomial{
	int a;
	int b;
	int c;

	// constructor
	Polynomial(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	// Used if statments for the logic
	void printP() {
		if (a != 0 && b != 0 && c != 0) {
			System.out.println(a + "x^2 " + (b > 0 ? "+ " : "") + b + "x " + (c > 0 ? "+ " : "") + c);
		} else if (a != 0 && b != 0) {
			System.out.println(a + "x^2 " + (b > 0 ? "+ " : "") + b + "x");
		} else if (a != 0 && c != 0) {
			System.out.println(a + "x^2 " + (c > 0 ? "+ " : "") + c);
		} else if (b != 0 && c != 0) {
			System.out.println(b + "x " + (c > 0 ? "+ " : "") + c);
		} else if (a != 0) {
			System.out.println(a + "x^2");
		} else if (b != 0) {
			System.out.println(b + "x");
		} else if (c != 0) {
			System.out.println(c);
		} else {
			System.out.println("0");
		}
	}

	// logic of caclation
	double evalP(double xVal){
		return a * Math.pow(xVal, 2) + b * xVal + c;
	}

	// adds anouther polynomal
	void addP(Polynomial p1){
		this.a += p1.a;
		this.b += p1.b;
		this.c += p1.c;
	}
	
}