import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0){
            System.out.println("a is positive");
        }else if(a<0){
            System.out.println("a is negative");
        }else{
            System.out.println("It is Zero");
        }
        sc.close();
    }
}
