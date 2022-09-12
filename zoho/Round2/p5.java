package zoho.Round2;
import java.util.*;
public class p5 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[][] arr=new int[n][n];
       for(int i=0;i<n;i++){       
           for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       System.out.println();   // spacing

       for(int i=0;i<n;i++){   // Printing question
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    boolean isLower=true;
    boolean isUpper=true;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i<j){
                if(arr[i][j]!=0){
                    isLower=false;
                }
            }else if(i>j){
                if(arr[i][j]!=0){
                    isUpper=false;
                }
            }
        }
    }
    if((isLower&&isUpper)||(!isLower&&!isUpper)){
        System.out.println("Not a triangular matrix");
    }else if(isLower){
        System.out.println("Lower triangular matrix");
    }else if(isUpper){
        System.out.println("Upper triangular matrix");
    }


    }
}
