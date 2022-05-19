import java.util.Scanner;

public class RatCountHouse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
       System.out.println(solve(r,unit,arr,n)); 
    }
    private static int solve(int r,int unit,int[] arr,int n){
        if(arr==null){
            return -1;
        }
        int needed=r*unit;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum<=needed){
                sum+=arr[i];
            }else{
                return i-1;
            }
        }
        return 0;
    }
}
