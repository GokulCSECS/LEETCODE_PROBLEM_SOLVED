class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reversefu(nums,0,n-k-1);
        reversefu(nums,n-k,n-1);
         reversefu(nums,0,n-1);
      
    }
     private void reversefu(int nums[],int st,int en)
        {
            while(st<en)
            {
                int temp=nums[st];
                nums[st]=nums[en];
                nums[en]=temp;
                st++;
                en--;
            }
            
        }
}