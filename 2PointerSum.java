public class 2PointerSum {
  class Solution {
    public int maxOperations(int[] nums, int k) {
     Arrays.sort(nums);         
    int left =0;
    int right=nums.length-1;
    int operation=0;
    while (left< right){
        int sum = nums[left]+nums[right];
        if(sum==k){
            operation++;
            left++;
            right--;
            }
        else if  (sum<k){
            left++;
        } else {
            right--;
        }  
    } return operation;

     }
}
}
