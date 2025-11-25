import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String msg) {
        super(msg);
    }
}

class InputScanner {
    Scanner sc = new Scanner(System.in);
}

class Father extends InputScanner {
    int father_age;

    public Father() throws WrongAge {
        System.out.println("Enter the father's age: ");
        father_age = sc.nextInt();
        if (father_age < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    public void display() {
        System.out.println("The father's age is: " + father_age);
    }
}

class Son extends Father {
    int son_age;

    public Son() throws WrongAge {
        System.out.println("Enter the son's age: ");
        son_age = sc.nextInt();
        if (son_age < 0) {
            throw new WrongAge("Age cannot be negative");
        } else if (son_age >= father_age) {
            throw new WrongAge("Son's age cannot be greater than father's age");
        }
    }

    public void display() {
        super.display();
        System.out.println("The son's age is: " + son_age);
    }
}

public class Lab7 {
    public static void main(String[] args) {
        try {
            Son s = new Son();
            s.display();
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}
