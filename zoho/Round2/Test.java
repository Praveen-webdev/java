package zoho.Round2;
import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=8;
        for(int i=1;i<=n;i++){
            int p=i;
            for(int j=1,k=n-1;j<=i;j++,k--){
                System.out.print(p+" ");
                p=p+k;
            }
            System.out.println();
        }
        
    }
}