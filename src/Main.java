
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        CR cr=new CR();
        Student std1=new Student(cr, 1);
        std1.subscribe();
        Student std2=new Student(cr, 2);
        std2.subscribe();
        Student std3=new Student(cr, 3);
        std3.subscribe();
        Scanner scn=new Scanner(System.in);
        String msg;
        while(true){
            System.out.print("Type a msg for the class: ");
            msg=scn.next();
            cr.setMsg(msg);
            std3.unsubscribe();
        }

    }
}
