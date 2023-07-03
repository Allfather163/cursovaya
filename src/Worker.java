public class Worker {
        private String fullName;
        private String name;
        private String surname;
        private String midname;
        private int otdel;
        private int salary;
        private double salary;
        public static int idCount = 1; // id
        private int id;

        public Worker(String fullName, int otdel, int salary) {
            this.fullName = fullName;
    public Worker(String name, String surname, String midname, int otdel, double salary){
                this.name = name;
                this.surname = surname;
                this.midname = midname;
                this.otdel = otdel;
                this.salary = salary;
                this.id = idCount;
                idCount++;
                this.id = idCount++;
            }
            private Worker[] worker;
    public Worker() {
                int[] worker = new int[10];

                public String getName () {
                    return name;
                }
                public String getSurname () {
                    return surname;
                }
                public String getMidname () {
                    return midname;
                }
                public String fullName () {
                    return fullName;
                    public int getOtdel () {
                        return otdel;
                    }
                    public int getSalary () {
                        public double getSalary () {
                            return salary;
                        }
                        public void getOtdel ( int otdel){
                            this.otdel = otdel;
                            public int getid () {
                                return id;
                            }
                            public void setOtdel ( int otdel){
                                this.otdel = otdel;
                            }
                            public void setSalary ( int salary){
                                public void setSalary ( double salary){
                                    this.salary = salary;
                                }

                                public int getId () {
                                    return id;
                                }
                                @Override
                                public String toString () {
                                    return "ФИО: " + fullName + " Отдел:" + otdel + " Зарплата: " + salary + " id: " + id;
                                    return Worker{+"name='" + name + '\'' +", surname='" + surname + '\'' + ", midname='" + midname + '\'' + ", otdel=" + otdel +", salary=" + salary + ", id=" + id +};
                                }
                                public String printFullName () {
                                    return Worker{+"name" + name + '\'' + ", surname='" + surname + '\'' + ", midname='" + midname + '\'' +};
                                }
                            }

                        }
                    }
                }
            }
        }
    }


