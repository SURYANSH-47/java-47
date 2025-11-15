import java.util.Scanner;

class Student {
    String name;
    String usn;
    int submarks[] = new int[8];
    int credits[] = new int[8];
    double sgpa;

    void getdetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = s.nextLine();
        System.out.println("Enter the usn: ");
        usn = s.nextLine();
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter the subject " + (i + 1) + "marks: ");
            submarks[i] = s.nextInt();
            System.out.println("Enter the credits of subject " + (i + 1) + ": ");
            credits[i] = s.nextInt();
        }
    }

    int getgrade(int m) {
        if (m >= 90)
            return 10;
        else if (m >= 80)
            return 9;
        else if (m >= 70)
            return 8;
        else if (m >= 60)
            return 7;
        else if (m >= 50)
            return 6;
        else
            return 0;

    }

    void getSgpa() {
        double totalcredit = 0;
        double totalmarks = 0;
        for (int i = 0; i < 8; i++) {
            totalmarks = totalmarks + (getgrade(submarks[i]) * credits[i]);
            totalcredit = totalcredit + credits[i];
        }
        sgpa = totalmarks / totalcredit;
    }

    void ddisplay() {
        System.out.println("NAME IS: " + name);
        System.out.println("USN IS: " + usn);
        System.out.println("SGPA IS: " + sgpa);
    }
}

class Sgpa {
    public static void main(String[] args) {
        Student students[] = new Student[2];
        for (int i = 0; i < 2; i++) {
            Student a = new Student();

            a.getdetails();
            a.getSgpa();
            students[i] = a;
        }
        for (int i = 0; i < 2; i++) {
            students[i].ddisplay();

        }
    }
}
