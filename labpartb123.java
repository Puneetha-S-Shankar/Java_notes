class partb1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



class partb2 {
    String name;
    String jobTitle;
    double salary;

    partb2() {
        this.name = "Unknown";
        this.jobTitle = "Not Assigned";
        this.salary = calculateSalary();
    }
    partb2(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = calculateSalary();
    }
    double calculateSalary() {
        double basic = 50000;
        double hra = basic * 0.12;
        double da = basic * 0.05;
        return basic + hra + da;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        partb2 e1 = new partb2();
        e1.display();
        partb2 e2 = new partb2("Puneeth", "Developer");
        e2.display();
    }
}


class partb3 {
    double savingsBalance;
    double currentBalance;
    void depositSavings(double amount) {
        savingsBalance += amount;
    }
    void withdrawSavings(double amount) {
        if (amount <= savingsBalance) {
            savingsBalance -= amount;
        } else {
            System.out.println("Insufficient Savings Balance!");
        }
    }
    void addInterest() {
        savingsBalance += savingsBalance * 0.006;
    }
    void depositCurrent(double amount) {
        currentBalance += amount;
    }
    void withdrawCurrent(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
        } else {
            System.out.println("Insufficient Current Balance!");
        }
    }
    void display() {
        System.out.println("Savings Balance: " + savingsBalance);
        System.out.println("Current Balance: " + currentBalance);
    }
    public static void main(String[] args) {
        partb3 acc = new partb3();
        acc.depositSavings(10000);
        acc.depositCurrent(5000);
        acc.withdrawSavings(2000);
        acc.withdrawCurrent(1000);
        acc.addInterest();
        acc.display();
    }
}

