// import java.util.*;
// class Solution {

//     public int[] rearrangeArray(int[] nums) {
//         int n =nums.length;
//         List<Integer>pos= new ArrayList<> ();
//         List<Integer>neg= new ArrayList<> ();
//         for(int i =0 ; i< n ;i++ ){
//             if(nums[i]>0){
//                 pos.add(nums[i]);
//             }
//             else{
//                 neg.add(nums[i]);
//             }
//         }
//         for(int i = 0 ; i < n/2 ; i++){
//             nums[i*2]=pos.get(i);
//             nums[i*2+1 ]=neg.get(i);
//         }
//         return nums;
//     }
// }
class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int num : nums) {
            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }

        return ans;
    }
}