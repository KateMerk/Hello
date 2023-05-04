package part1.Task35;

public class MainEmployee {
    public static void main(String[] args) {
        Manager boss= new Manager("Boss",2000.5,5);
        Accountant accountant = new Accountant("Бухгалтер",1500);
        Worker worker = new Worker("Worker",1200,300);
        System.out.println(boss.getSalary());
        System.out.println(accountant.raiseSalary(300));
        System.out.println(worker.getSalary());





    }
}
