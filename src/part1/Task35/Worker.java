package part1.Task35;

public class Worker extends Employee {
    private double bonus;

    public Worker(String position, double salary, double bonus) {
        super(position, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double BaseSalary= super.getSalary();
       return BaseSalary + bonus;
    }


}
