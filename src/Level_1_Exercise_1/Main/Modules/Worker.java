package Level_1_Exercise_1.Main.Modules;

public abstract class Worker {

    protected String name;
    protected String lastName;
    protected float priceHour;

    public Worker(String name, String lastName, float priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public abstract float calculateSalary(float hoursWorked);

}
