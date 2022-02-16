package Array;

public class ArrProb {
    public static void main(String[] args) {
        int nums[] = {2,7,-2};
        System.out.println(has271(nums));
    }
    private static boolean has271(int[] nums) {
        boolean out=false;
        for(int i=0;i+2<nums.length;i++){
          if(nums[i+1]==nums[i]+5){
            if(Math.abs(nums[i+2] - (nums[i]-1)) <=2 ){ //difference less than or equal to 2
              out=true;
              break;
            }
          }
        }
        return out;
      }
}

