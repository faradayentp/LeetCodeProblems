package leetCode;
import java.util.*;
public class RotateArrayLeetCode {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7};
		rotate(arr,3);

	}
    public static void rotate(int[] nums, int k) {
    	 int[] tempArray=new int[nums.length-1];
         tempArray=Arrays.copyOf(nums,nums.length);
         int j=nums.length;
         k=k%j;
         if(j>1){
         for(int i=0;i<k;i++){
             nums[i]=nums[j-k];
             j++;
             
         }
         for(int i=k;i<nums.length;i++){
             nums[i]=tempArray[i-k];
         }
         }
         System.out.println(Arrays.toString(nums));
    }

}
