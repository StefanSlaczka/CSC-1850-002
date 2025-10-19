class Truck extends Car{
    int cargo;

    public Truck(){}
    public Truck(String nameOfCar, int cargo){
        this.cargo = cargo;
        this.nameOfCar = nameOfCar;
    }
    public String getNameOfCar(){
        return nameOfCar;
    }
    public void setNameOfCar(String nameOfCar){
        this.nameOfCar = nameOfCar;
    }

    public int getCargo(){
        return cargo;
    }
    public void setCargo(int cargo){
        this.cargo = cargo;
    }

    public String toString(){
        return "" + cargo;
    }
}