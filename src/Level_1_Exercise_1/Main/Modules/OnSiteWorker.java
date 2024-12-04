package Level_1_Exercise_1.Main.Modules;

public class OnSiteWorker extends Worker{

    private static float oil=30.5f;

    public OnSiteWorker(String name, String lastName, float priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public float calculateSalary(float hoursWorked){
        return (hoursWorked*super.priceHour)+ oil;
    }
}
