public class Car {
    private int id;
    private int numCar;

    public Car(int id, int numCar) {
        this.id = id;
        this.numCar = numCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCar() {
        return numCar;
    }

    public void setNumCar(int numCar) {
        this.numCar = numCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numCar=" + numCar +
                '}';
    }
}
