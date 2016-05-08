package part2.day4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18byungwookkim on 5/8/16.
 */
public class CarRentalHistoryManager {
    List<CarRentalHistory> carRentalHistories;

    public CarRentalHistoryManager() {
        carRentalHistories = new ArrayList<>();
    }

    public void addRentRecord(CarRentalHistory carRentalHistory) {
        carRentalHistory.setHistoryType(HistoryType.RENT);
        carRentalHistories.add(carRentalHistory);
    }

    public void addReturnRecord(CarRentalHistory carRentalHistory) {
        carRentalHistory.setHistoryType(HistoryType.RETURN);
        carRentalHistories.add(carRentalHistory);
    }

    public void addExtendRecord(CarRentalHistory carRentalHistory) {
        carRentalHistory.setHistoryType(HistoryType.EXTEND);
        carRentalHistories.add(carRentalHistory);
    }
    
}
