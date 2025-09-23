import java.util.Scanner;
import java.lang.Math;
class Lab1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coefficents: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r1,r2;
        if(a==0){
            System.out.println("Not a quadritic equation");
            System.out.println("Again enter a: ");
            int p=sc.nextInt();
            a=p;
            }
        double d=(b*b)-(4*a*c);
        if(d==0){
             r1=(-b)/(double)(2*a);
            System.out.println("Roots are equal");
            System.out.println("The roots are: "+r1);
        }
        else if(d>0){
             r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
             r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
            System.out.println("The roots are: "+r1+", "+r2);
            }
        else{
            System.out.println("The roots are imaginary");
            r1=((-b))/(double)(2*a);
            r2=((Math.sqrt(-d)))/(double)(2*a);
            System.out.println("The roots are: "+r1+"+"+r2+"i");
            System.out.println("The roots are: "+r1+"-"+r2+"i");



        }
       


        
    }
}