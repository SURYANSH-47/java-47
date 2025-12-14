class College_Thread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("BMS COLLEGE OF ENGINEERING");
                Thread.sleep(10000);
            }

        } catch (InterruptedException e) {
            System.out.println("COLLEGE THREAD INTERRUPTED");
        }
    }
}
class Cse_Thread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("CSE THREAD INTERRUPTED");
        }
    }
}
class Lab8{
    public static void main(String[] args) {
        College_Thread t1=new College_Thread();
        Cse_Thread t2=new Cse_Thread();
        t1.start();t2.start();
    }
}