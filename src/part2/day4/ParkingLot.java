package part2.day4;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18byungwookkim on 5/8/16.
 */
public class ParkingLot {
    private int capacity;
    private List<Car> listCar;

    /** Getters and Setters */
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getListCar() {
        return listCar;
    }

    public void setListCar(List<Car> listCar) {
        this.listCar = listCar;
    }

    public void addCar(Car car) {
        this.listCar.add(car);
    }

    /**
     * No Arguments Constructor
     */
    public ParkingLot() {
        listCar = new ArrayList<>();
    }

    /**
     * search and return the car
     * @param modelName model name of the car to be retrieved
     * @return if not found, return null
     */
    public Car getRequestedCar(String modelName) {
        for (Car car: listCar) {
            if (modelName.equals(car.getModel())) {
                return car;
            }
        }
        return null;

    }
}