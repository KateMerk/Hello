package part1.Task35;

public  class Employee {
    private String position;
    private double salary;

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double raiseSalary(double byPercent){
        double raise= salary*byPercent/100;
        salary+=raise;
        return raise;

    }

}
