package AutoBoxingUnboxing;
import java.util.Scanner;

public class Example1 {
    static int m(Integer v){
        return v;
    }
    public static void main(String[] args) {
        Integer iob = m(055);
        System.out.println(iob);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an int value:");
        iob = s.nextInt();
        System.out.println("Value of iob: "+iob);
        iob++;
        System.out.println("Value of iob after increment: "+iob);
        int i = iob + (iob/3);
        System.out.println("Value of i after arthematical operation: "+i);
    }
    
}
