public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    public double raiseSalary() {
        int year = 2021;
        int workYear = year - hireYear;
        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }
    public String toString() {
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (salary - tax() + bonus() + raiseSalary()));
        return "";
    }
}
