import java.util.*;
public class factorial {
    public static int fact(int b){
        if(b==1) return 1;
        return b*fact(b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Factorial is : "+fact(n));
    }
}
