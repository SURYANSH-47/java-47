package Cie;
import java.util.Scanner;
public class Student {
    protected String usn = new String(); protected String name = new String(); protected int sem;
    public void input_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=sc.nextLine();
        System.out.println("Enter the usn: ");
        usn=sc.nextLine();
        System.out.println("Enter the sem: ");
        sem=sc.nextInt();
    }
    public void display(){
        System.out.println("Name of the student is: "+name);
        System.out.println("USN is: "+usn);
        System.out.println("SEM is: "+sem);
    }
}
