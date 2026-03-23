
//3a
class Circle {
    double radius;

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5; 

        double perimeter = c.calculatePerimeter();
        System.out.println(perimeter);
    }

}





//3b

class RetailStore {
    double billAmount;

    double calculateDiscount() {
        if (billAmount >= 5000) {
            return billAmount * 0.20;
        } else if (billAmount >= 2000) {
            return billAmount * 0.10;
        } else {
            return billAmount * 0.05;
        }
    }

    void displayFinalBill() {
        double discount = calculateDiscount();
        double finalAmount = billAmount - discount;

        System.out.println("Original Bill: " + billAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalAmount);

    }
    public static void main(String[] args) {
        RetailStore rs = new RetailStore();
        rs.billAmount = 3000;

        rs.displayFinalBill();
    }
}


//3c

class MobileBill {
    int localCalls;
    int isdCalls;
    int dataGB;
    MobileBill() {
        localCalls = 0;
        isdCalls = 0;
        dataGB = 0;
    }
    MobileBill(int localCalls, int isdCalls, int dataGB) {
        this.localCalls = localCalls;
        this.isdCalls = isdCalls;
        this.dataGB = dataGB;
    }
    double calculateBill() {
        double localCost = localCalls * 0.10;
        double isdCost = isdCalls * 1.00;
        double dataCost = dataGB * 500;
        return localCost + isdCost + dataCost;
    }
    void displayBill() {
        System.out.println("Local Calls Cost: " + (localCalls * 0.10));
        System.out.println("ISD Calls Cost: " + (isdCalls * 1.00));
        System.out.println("Data Cost: " + (dataGB * 500));
        System.out.println("Total Bill: " + calculateBill());
    }
    public static void main(String[] args) {
        MobileBill m1 = new MobileBill();
        m1.displayBill();
        MobileBill m2 = new MobileBill(100, 10, 2);
        m2.displayBill();
    }
}



