package SEE;
import java.util.Scanner;
import Cie.Internals;
public class Externals extends Internals{
    protected int marks[];

protected int finalMarks[];
public Externals(){
    marks=new int[5];finalMarks=new int[5];
}
public void inputSEEmarks(){
    Scanner s=new Scanner(System.in);
    for(int i=0;i<5;i++){
        System.out.println("Enter the subject "+(i+1)+" marks: ");
        marks[i]=s.nextInt();
    }
}
public void calculateFinalMarks(){
    
    for(int i=0;i<5;i++){
        finalMarks[i]=marks[i]+super.marks[i];
    }
}
public void display_marks(){
    super.display();
        System.out.println("The final marks in all 5 courses are: ");

    for(int i=0;i<5;i++){
        System.out.println("Course "+(i+1)+" is: "+finalMarks[i]);
    }
}
}
