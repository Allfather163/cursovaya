public class Main {

    public static void main(String[] args) {
        Worker[] workerCorp = new Worker[10];
        workerCorp[0] = new Worker("Иван Иванов Иванович ", 2,100000);
        workerCorp[1] = new Worker("Николай Николаев Николаевич", 1,50300);
        workerCorp[2] = new Worker("Сергей Сергеев Сергеевич", 3,150000);
        workerCorp[3] = new Worker("Александр Александров Александрович", 1,123450);
        workerCorp[4] = new Worker("Дмитрий Дмитриев Дмитриевич", 2,85000);
        workerCorp[5] = new Worker("Егор Егоров Егорович", 3,90000);
        workerCorp[6] = new Worker("Антон Антонов Антонович", 2,95000);
        workerCorp[7] = new Worker("Павел Павлов Павлович", 3,115000);
        workerCorp[8] = new Worker("Никита Никитов Никитович", 1,114000);
        workerCorp[9] = new Worker("Михаил Михаилов Михайлович", 2,99000);
        printListAllEmployee(workerCorp);
        calculateAllSalary(workerCorp);
        calculateEmployeeMinSalary(workerCorp);
        calculateEmployeeMaxSalary(workerCorp);
        calculateMediumSalary(workerCorp);
        Store store = new Store();
        store.printAllEmp();
        System.out.println("Фонд отплаты труда: " + store.calculateAllSal());
        System.out.println("Сотрудник с минимальной зарплатой: " + store.calculateMinEmp());
        System.out.println("Сотрудник с максимальной зарплатой: " + store.calculateMaxEmp());
        System.out.println("Средняя зарплата офиса: " + store.calculateMediumSal());
        store.printFullName();
    }

    public static void printListAllEmployee(Worker[] worker) {
        System.out.println("Книга сотрудников");
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
        }
    }

    public static int calculateAllSalary(Worker[] worker) {
        System.out.println("Зарплата всех сотрудников:");
        int allSalary = 0;
        for (int i = 0; i < worker.length; i++) {
            allSalary = allSalary + worker[i].getSalary();
        }
        System.out.println(allSalary + " рублей.");
        return allSalary;
    }


    public static int calculateEmployeeMinSalary(Worker[] worker) {
        System.out.println("Минимальная зарплата: ");
        int minSalary = worker[0].getSalary();
        int minSalIndex = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getSalary() < minSalary) {
                minSalary = worker[i].getSalary();
                minSalIndex = i;
            }
        }
        System.out.println(minSalary + " рублей. Сотрудник - " + worker[minSalIndex]);
        return minSalary;
    }

    public static int calculateEmployeeMaxSalary(Worker[] worker) {
        System.out.println("Максимальная зарплата: ");
        int maxSalary = worker[0].getSalary();
        int maxSalIndex = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getSalary() > maxSalary) {
                maxSalary = worker[i].getSalary();
                maxSalIndex = i;
            }
        }
        System.out.println(maxSalary + " рублей. Сотрудник - " + worker[maxSalIndex]);
        return maxSalary;
    }

    public static int calculateMediumSalary(Worker[] worker) {
        System.out.println("Средняя зарплата всех сотрудников по офису:");
        int allSalary = 0;
        int medSalary = 0;
        for (int i = 0; i < worker.length; i++) {
            allSalary = allSalary + worker[i].getSalary();
        }
        medSalary = allSalary / worker.length;

        System.out.println(medSalary + " рублей.");
        return medSalary;


    }
}

