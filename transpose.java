import java.util.*;
public class transpose {
    public static void main(String[] args) {
        int original[][]=new int[100][100];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rows and columns :");
        int r=sc.nextInt(),c=sc.nextInt();
        System.out.println("Enter matrix elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                original[i][j]=sc.nextInt();
            }
        }
        int transpose[][]=new int[100][100];
        for(int i=0;i<r;i++){    
            for(int j=0;j<c;j++){    
             transpose[i][j]=original[j][i];  
           }    
          }      
        System.out.println("Printing Matrix After Transpose:");  
        for(int i=0;i<r;i++){    
        for(int j=0;j<c;j++){    
        System.out.print(transpose[i][j]+" ");    
        }    
        System.out.println();
        }
    }
}
