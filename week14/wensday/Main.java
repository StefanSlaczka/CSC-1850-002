class Employee{
    public static int numOfEmployee = 0;
    public String name;
    protected double salary;

    Employee(){}

    Employee(String name, double salary){
        this.name = name; this.salary = salary; numOfEmployee++;
    }

    Employee(String name){name = name; salary = 0;}

    public String toString(){
        return "Employee "+ name + " has salary "+ salary;
    }

    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    public String deparment;

    Manager(){}
    Manager(String name){super(name);}
    Manager(String deparment, double salary, String name){
        super(name, salary); this.deparment = deparment;
    }
    @Override
    public String toString(){
        return "Manager "+ name + " has salary "+ salary + " and his deparment " + deparment;
    }
}

final class Executive extends Manager{
    Executive(){}
    Executive(String name, double salary, String deparment){
        super(name, salary, deparment);
    }
    @Override
    public String toString(){
        return "Executive "+ name + " has salary "+ salary + " and his deparment " + deparment;
    }
}

class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1000);
        Employee m = new Manager("Bob", 13000, "112");
        Employee e2 = new Executive("Cindy", 2340000, "113");

        System.out.println(e1.toString());
        System.out.println(m.toString());
        System.out.println(e2.toString());

    }
}