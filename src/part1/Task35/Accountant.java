package part1.Task35;

public class Accountant extends Employee{
    public Accountant(String position, double salary) {
        super(position, salary);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public double raiseSalary(double byPercent) {
        return super.raiseSalary(byPercent);
    }
}



