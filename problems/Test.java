public class Test {
    public static void main(String[] args) {
        int i;
        for(i=0;i<1000;i++){
            if(i<10)
            System.out.println("00"+i);
            else if(i<100)
            System.out.println("0"+i);
            else
            System.out.println(i);
        }
    }
}
