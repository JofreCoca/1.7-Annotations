package Level_1_Exercise_2.Modules;

import java.util.Date;

public class OnSiteWorker extends Worker {

    private static float oil=30.5f;

    public OnSiteWorker(String name, String lastName, float priceHour) {
        super(name, lastName, priceHour);
    }

    public static float getOil() {
        return oil;
    }

    public static void setOil(float oil) {
        OnSiteWorker.oil = oil;
    }

    @Override
    public float calculateSalary(float hoursWorked){
        return (hoursWorked*super.priceHour)+ oil;
    }

    @Deprecated
    public static void oldMethod() {
        Date date = new Date();
        int year = date.getYear();
        System.out.println("Old method deprecated: date.getYear()="+date.getYear());
    }
}
