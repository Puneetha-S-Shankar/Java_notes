interface Student {
    void displayStudentDetails();
}
class Internal implements Student {
    int internalMarks = 40;
    String name = "Puneeth";
    int rollNo = 101;

    public void displayStudentDetails() {
        System.out.println(name + " " + rollNo);
    }

    void displayInternalDetails() {
        System.out.println("Internal: " + internalMarks);
    }
}
interface External extends Student {
    void displayExternalDetails();
}
class Results extends Internal implements External {
    int externalMarks = 50;

    public void displayExternalDetails() {
        System.out.println("External: " + externalMarks);
    }

    void displayFinalResult() {
        System.out.println("Total: " + (internalMarks + externalMarks));
    }
}
class Main {
    public static void main(String[] args) {
        Results r = new Results();

        r.displayStudentDetails();
        r.displayInternalDetails();
        r.displayExternalDetails();
        r.displayFinalResult();
    }
}
