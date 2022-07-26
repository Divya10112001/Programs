import java.util.*;
public class pnc { 
    public static int fact(int b){
    if(b==1) return 1;
    return b*fact(b-1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers :");
    int n=sc.nextInt(), r=sc.nextInt();
    System.out.println("Permutation is : "+fact(n)/fact(n-r)+"\nCombination is : "+fact(n)/(fact(n-r)*fact(r)));
 } 
}
