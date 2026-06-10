
class Solution {
    // Function to move all zeroes to end
    public int[] moveZeroes(int[] arr) {
        // Create temp array
        int[] temp = new int[arr.length];

        // Pointer for temp
        int index = 0;

        // Traverse input array
        for (int i = 0; i < arr.length; i++) {
            // If non-zero, copy to temp
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Copy temp back to original
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        // Return updated array
        return arr;
    }
}
