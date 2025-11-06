import java.util.Scanner;
class Account{
    String customer_name;int acc_no;String type;
    Account(String n,int a){
        customer_name=n;acc_no=a;
    }
}
class Savings_Account extends Account{
    double balance=0;double rate=0.05;double time_in_years=0.25;

    Savings_Account(String name,int a){
        super(name,a);
        super.type="savings";}
    void compute_interest(){
        System.out.println("The interest earned is: "+balance*(rate/time_in_years));
        balance=balance+(balance*(rate/time_in_years));
        System.out.println("The balance is: "+balance);
    }
    void deposit(double d){
        balance=balance+d;
    }
    void withdraw(double w){
        balance=balance-w;
    }
    void display(){
        System.out.println("Customer name: "+customer_name);
        System.out.println("Account number is: "+acc_no);
        System.out.println("Type of account is: Savings");
        System.out.println("Balance is: "+balance);
    }

}

class Current_Account extends Account{
    double balance=0;double service_charge=150;double min_balance=3000;
    Current_Account(String name,int a){
        super(name,a);super.type="current";}

    void deposit(double d){
        balance=balance+d;
    }
    void check_balance(){
        if(balance<min_balance){
            System.out.println("Balance is less than minimum balance service charge deducted");
            balance=balance-service_charge;
        }
    }
    void compute_interest(){
        System.out.println("This facility not available.");
    }
    void withdraw(double w){
        balance=balance-w;
        check_balance();
    }
    void display(){
        System.out.println("Customer name: "+customer_name);
        System.out.println("Account number is: "+acc_no);
        System.out.println("Type of account is: CURRENT");
        System.out.println("Balance is: "+balance);
    }
}
public class Lab5 {
    public static void main(String[] args) {
        int q;String type;int accno;double deposit;double withdraw;
        String qwe="Savings";String lwe="Current";
        Scanner s=new Scanner(System.in);
        String name;int accno1;int l;
        Account[] a=new Account[2];
        Savings_Account[] we=new Savings_Account[2];
        Current_Account[] r=new Current_Account[2];
        for(int i=0;i<2;i++){
            System.out.println("Enter the name: ");
            name=s.nextLine();
            System.out.println("Enter the accno: ");
            accno=s.nextInt();
            a[i]=new Account(name,accno);
            we[i]=new Savings_Account(name, accno);
            r[i]=new Current_Account(name, accno);
            s.nextLine();
        }
        for(int i=1;i>0;i++){
            System.out.println("1.Withdraw   2.Deposit   3.Compute interest for savings account    4.Display account details    5.EXIT");
            System.out.println("Enter the choice: ");
            q=s.nextInt();
            s.nextLine();
            System.out.println("Enter the type of account: ");
            type=s.nextLine();
            if(type.equalsIgnoreCase(qwe)){
                System.out.println("Enter the accno: ");
                accno1=s.nextInt();
                for(l=0;l<2;l++){
                    if(accno1==we[l].acc_no){

                        break;
                    }
                }
                switch(q){
                    case 1:
                        System.out.println("Enter the withdraw: ");
                        withdraw=s.nextDouble();
                        we[l].withdraw(withdraw);
                        break;
                    case 2:
                        System.out.println("Enter the deposit: ");
                        deposit=s.nextDouble();
                        we[l].deposit(deposit);
                        break;
                    case 3:
                        we[l].compute_interest();
                        break;
                    case 4:
                        we[l].display();
                        break;
                    case 5:System.exit(0);

                }
            }
            else if(type.equalsIgnoreCase(lwe)){
                System.out.println("Enter the accno: ");
                accno1=s.nextInt();
                for(l=0;l<2;l++){
                    if(accno1==r[l].acc_no){

                        break;
                    }
                }
                switch(q){
                    case 1:
                        System.out.println("Enter the withdraw: ");
                        withdraw=s.nextDouble();
                        r[l].withdraw(withdraw);
                        break;
                    case 2:
                        System.out.println("Enter the deposit: ");
                        deposit=s.nextDouble();
                        r[l].deposit(deposit);
                        break;
                    case 3:
                        r[l].compute_interest();
                        break;
                    case 4:
                        r[l].display();
                        break;
                    case 5:System.exit(0);



                }
            }
        }




    }
}
