import java.util.Scanner;
public class oddInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting range : ");
        int start=sc.nextInt();
        System.out.println("Enter end range : ");
        int end=sc.nextInt();
        for(int i=start+1;i<=end-1;i++){
            if(i%2 != 0){
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
