package Level_1_Exercise_2.Modules;

import java.time.LocalTime;
import java.util.Date;

public class WorkerOnline extends Worker {

    private final float flatRateInternet;

    public WorkerOnline(String name, String lastName, float priceHour) {
        super(name, lastName, priceHour);
        this.flatRateInternet=20.7f;
    }

    public float getFlatRateInternet() {
        return flatRateInternet;
    }

    @Override
    public float calculateSalary(float hoursWorked){
        return (hoursWorked*super.priceHour)+ this.flatRateInternet;
    }

    @Deprecated
    public static void oldMethod() {
        LocalTime localTimeNow = LocalTime.now();
        System.out.println("Old method deprecated: LocalTime.now()="+localTimeNow);
    }
}
