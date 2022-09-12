package dark.MNC;

public class Temp {
    public static void main(String[] args) {
       int m=30,n=472,p=1;
       while(n!=0){
           p=n%10;
           m=m+n%p;
           n=n/10;
       }
       System.out.println(m);
    }
}
