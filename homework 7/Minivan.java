class Minivan extends Car{
    int maxPassengers;


    public Minivan(){}
    public Minivan(String nameOfCar, int maxPassengers){
        this.nameOfCar = nameOfCar;
        this.maxPassengers = maxPassengers;
    }
    public String getNameOfCar(){
        return nameOfCar;
    }
    public void setNameOfCar(String nameOfCar){
        this.nameOfCar = nameOfCar;
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }
    
    public String toString(){
        return "" + maxPassengers;
    }
}