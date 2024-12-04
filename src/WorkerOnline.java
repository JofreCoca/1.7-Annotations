public class WorkerOnline extends Worker{

    private final float flatRateInternet;

    public WorkerOnline(String name, String lastName, float priceHour) {
        super(name, lastName, priceHour);
        this.flatRateInternet=20.7f;
    }

    @Override
    public float calculateSalary(float hoursWorked){
        return (hoursWorked*super.priceHour)+ this.flatRateInternet;
    }
}
