package pair.programming.day7;

import java.time.LocalTime;

public class Cashier extends Person{
    private LocalTime startOfShift, endOfShift;

    public Cashier(String name, LocalTime startOfShift, LocalTime endOfShift) {
        super(name);
        this.startOfShift = startOfShift;
        this.endOfShift = endOfShift;
    }

    public LocalTime getStartOfShift() {
        return startOfShift;
    }

    public void setStartOfShift(LocalTime startOfShift) {
        this.startOfShift = startOfShift;
    }

    public LocalTime getEndOfShift() {
        return endOfShift;
    }

    public void setEndOfShift(LocalTime endOfShift) {
        this.endOfShift = endOfShift;
    }
}
