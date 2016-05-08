package part2.day4;

import java.util.Date;
import java.util.List;

/**
 * Created by 18byungwookkim on 5/8/16.
 */
public class Customer {
    private String credit;
    private String customerID;
    private boolean license;
    private String name;
    private Date dateOfBirth;
    private String driversHistory;
    private String address;
    private List<Car> rentedCar;

    /**
     * Getter & Setter
     */

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDriversHistory() {
        return driversHistory;
    }

    public void setDriversHistory(String driversHistory) {
        this.driversHistory = driversHistory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Car> getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(List<Car> rentedCar) {
        this.rentedCar = rentedCar;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
