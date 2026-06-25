// class WelcomeThread extends Thread {
//     public void run() {
//         try {
//             System.out.println("Welcome to Multithreading!");
//             Thread.sleep(200);
            
//             System.out.println("This message is shown after 200ms delay.");
//         } 
//         catch (InterruptedException e) {
//             System.out.println("Thread was interrupted");
//         }
//     }
// }
// public class lab6parta {
//     public static void main(String[] args) {
//         WelcomeThread t1 = new WelcomeThread();
//         t1.start();
//     }
// }


// class EvenThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 System.out.println("Even: " + i);
//             }
//         }
//     }
// }
// class OddThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 != 0) {
//                 System.out.println("Odd: " + i);
//             }
//         }
//     }
// }
// public class lab6parta {
//     public static void main(String[] args) {
        
//         EvenThread even = new EvenThread();
//         OddThread odd = new OddThread();
//         try {
//             even.start();
//             even.join();
//             odd.start();
//         } catch (InterruptedException e) {
//             System.out.println("Thread interrupted");
//         }
//     }
// }


public class lab6parta {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        try {
            String str = getNullString(); // avoids IDE warning
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred");
        }
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception occurred");
        }
        try {
            int x = Integer.parseInt(null); // can throw generic exception
        } catch (Exception e) {
            System.out.println("Generic Exception occurred");
        }
        System.out.println("Program continues...");
    }
    static String getNullString() {
        return null;
    }
}
