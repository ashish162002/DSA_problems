class Solution {
    public int singleNumber(int[] nums) {
      int singleNumb = 0;
   for( int i =0 ; i< nums .length ; i++){
singleNumb ^= nums[i];

   }
   return singleNumb;
    }
}