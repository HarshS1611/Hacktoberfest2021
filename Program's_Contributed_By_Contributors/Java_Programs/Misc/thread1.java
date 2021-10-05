//Threading example to run two different functions with time difference of 500ms.
class odd extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            try {
                sleep(500);
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            catch(Exception e){
                    System.out.println(e);
                }
            }
    }
}
class even extends Thread{
    public void run(){
        for(int i=1;i<=50;i++) {
            try {
                sleep(500);
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class thread1 {
    public static void main(String[] args){
        odd o=new odd();
        even e=new even();
        o.start();
        e.start();
    }
}
