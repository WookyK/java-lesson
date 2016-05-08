package part2.day4;

import java.util.Date;

/**
 * Created by 18byungwookkim on 5/8/16.
 */
public class CarRentalHistory {
    public HistoryType getHistoryType() {
        return historyType;
    }

    public void setHistoryType(HistoryType historyType) {
        this.historyType = historyType;
    }

    /** RENT, RETURN, EXTEND */
//    private String historyType;
    private HistoryType historyType;
    private String customerID;
    private String car;
    private Date dueDate;
    private Date rentDate;
    private Date extendedDueDate;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getExtendedDueDate() {
        return extendedDueDate;
    }

    public void setExtendedDueDate(Date extendedDueDate) {
        this.extendedDueDate = extendedDueDate;
    }
}
