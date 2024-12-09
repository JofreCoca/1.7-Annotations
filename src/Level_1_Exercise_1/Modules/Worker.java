package Level_1_Exercise_1.Modules;

public abstract class Worker {

    protected String name;
    protected String lastName;
    protected float priceHour;

    public Worker(String name, String lastName, float priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(float priceHour) {
        this.priceHour = priceHour;
    }

    public abstract float calculateSalary(float hoursWorked);

}
