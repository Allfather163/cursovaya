public class Store {
        private Worker[] workerCorp = new Worker[10];
        public Store() {
            workerCorp[0] = new Worker("Иван Иванов Иванович", 2,   100000);
            workerCorp[1] = new Worker("Николай Николаев Николаевич", 1,  50300);
            workerCorp[2] = new Worker("Сергей Сергеев Сергеевич", 3,   150000);
            workerCorp[3] = new Worker("Александр Александров Александрович", 1,   123450);
            workerCorp[4] = new Worker("Дмитрий Дмитриев Дмитриевич", 2,   85000);
            workerCorp[5] = new Worker("Егор Егоров Егорович", 3,   90000);
            workerCorp[6] = new Worker("Антон Антонов Антонович", 2,   95000);
            workerCorp[7] = new Worker("Павел Павлов Павлович", 3,   115000);
            workerCorp[8] = new Worker("Никита Никитов Никитович", 1,   114000);
            workerCorp[9] = new Worker("Михаил Михаилов Михайлович", 2,   99000);
        }
        public void printAllEmp() {
            for (Worker worker : workerCorp) {
                System.out.println(worker);
            }
        }
        public double calculateAllSal() {
            double salaries = 0;
            for (Worker worker : workerCorp) {
                salaries += worker.getSalary();
            }
            return salaries;
        }
        public Worker calculateMinEmp() {
            Worker calculateMinEmp = workerCorp[0];
            for (Worker worker : workerCorp) {
                if (worker.getSalary() < calculateMinEmp.getSalary()) {
                    calculateMinEmp = worker;
                }
            }
            return calculateMinEmp;
        }
        public Worker calculateMaxEmp() {
            Worker calculateMaxEmp = workerCorp[0];
            for (Worker worker : workerCorp) {
                if (worker.getSalary() > calculateMaxEmp.getSalary()) {
                    calculateMaxEmp = worker;
                }
            }
            return calculateMaxEmp;
        }
        public double calculateMediumSal() {
            double allSal = calculateAllSal();
            return  allSal / workerCorp.length;
        }
        public void  printFullName() {
            for (Worker worker : workerCorp) {
                System.out.println(worker.printFullName());
            }
        }
    }


