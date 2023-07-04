public class Worker {
    private String fullName;
    private int otdel;
    private int salary;
    private int id;

    private static int idCount = 1; // id

    public Worker(String fullName, int otdel, int salary) {
        this.fullName = fullName;
        this.otdel = otdel;
        this.salary = salary;
        this.id = idCount++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getOtdel() {
        return otdel;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + " Отдел:" + otdel + " Зарплата: " + salary + " id: " + id;
    }

    public String printFullName() {
        return fullName;

    }
}


