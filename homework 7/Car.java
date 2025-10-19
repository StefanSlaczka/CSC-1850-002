class Car {
    String nameOfCar;
    int carYear;

    public Car(){}
    public Car(String nameOfCar, int carYear){
        this.nameOfCar = nameOfCar;
        this.carYear = carYear;
    }
    public String getNameOfCar(){
        return nameOfCar;
    }
    public int getCarYear(){
        return carYear;
    }
    public void setNameOfCar(String nameOfCar){
        this.nameOfCar = nameOfCar;
    }
    public void setCarYear(int carYear){
        this.carYear = carYear;
    }
    public String toString(){
        return nameOfCar + carYear;
    }

}