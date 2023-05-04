package part1.Task35;

public class Manager extends Employee{
    private double hour;

    public Manager(String position, double salary, double hour) {
        super(position, salary);
        this.hour = hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double getSalary() {
        return super.getSalary()*hour;

    }
}
