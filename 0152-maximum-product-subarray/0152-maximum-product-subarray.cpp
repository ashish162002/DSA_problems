class Solution {
public:
    int maxProduct(vector<int>& nums) {

        int maxSum = nums[0];

        for(int i = 0; i < nums.size(); i++) {

            int currSum = 1;

            for(int j = i; j < nums.size(); j++) {

                currSum *= nums[j];

                maxSum = max(maxSum, currSum);
            }
        }

        return maxSum;
    }
};