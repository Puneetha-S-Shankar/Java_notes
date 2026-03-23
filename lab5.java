class lab5a {
    interface Exam {
        double percentage();
    }
    static class Student {
        String name = "Puneetha";
        int rollNo = 101;
        int m1 = 80, m2 = 85, m3 = 90;
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
        }
    }
    static class Result extends Student implements Exam {
        public double percentage() {
            return (m1 + m2 + m3) / 3.0;
        }
        void displayResult() {
            displayDetails();
            System.out.println("Percentage: " + percentage());
        }
    }
    public static void main(String[] args) {
        Result r = new Result();
        r.displayResult();
    }
}



class lab5b {
    static class Palindrome {
        void check(int num) {
            int temp = num, rev = 0;
            while (num > 0) {
                int d = num % 10;
                rev = rev * 10 + d;
                num /= 10;
            }
            if (temp == rev)
                System.out.println(temp + " is Palindrome");
            else
                System.out.println(temp + " is Not Palindrome");
        }
    }
    static class OddEven {
        void check(int num) {
            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");
        }
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        OddEven o = new OddEven();
        int num = 121;
        p.check(num);
        o.check(num);
    }
}

