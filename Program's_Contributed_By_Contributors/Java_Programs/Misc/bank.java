
// Java program for OOPS and copy constructors.
import java.util.Scanner;

class customer{
    int custid;
    String Name,branch;
    int Accno,IFSC;
    customer(){}
    customer(int id, String name,int accno,int ifsc){
        custid=id;
        Name=name;
        Accno=accno;
        IFSC=ifsc;
        System.out.println(custid+" "+Name+" "+IFSC+" "+Accno);

    }
    void transcation(customer c){
        custid=c.custid;
        Name=c.Name;
        Accno=c.Accno;
        IFSC=c.IFSC;
        System.out.println(custid+" "+Name+" "+IFSC+" "+Accno);
        if(custid==1001 && Name=="harsh" && IFSC==333){
            System.out.println("can proceed for transcation");
        }
        else
            System.out.println("check your details");
    }
    void deposit(int id,String name){
        Scanner sc=new Scanner(System.in);
        custid=id;
        Name=name;
        int amount=500;
        int dep=sc.nextInt();
        System.out.println(id+" "+name+" "+dep);    }
}

public class bank {
    public static void main(String[] args){
        customer c=new customer(1001,"harsh",123,333);
        customer c1=new customer();
        //c.transcation(c1);
        c1.custid=c.custid;
        c1.Name=c.Name;
        c1.deposit(c1.custid,c1.Name);
    }
}
