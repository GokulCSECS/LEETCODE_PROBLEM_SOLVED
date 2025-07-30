class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = 0;
        
       
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        
       
        int longest = 0;
        int current = 0;
        
        for (int num : nums) {
            if (num == maxVal) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }
        
        return longest;
    }
}