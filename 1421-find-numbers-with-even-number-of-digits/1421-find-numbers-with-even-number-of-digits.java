class Solution {
    public int findNumbers(int[] nums) {
        int c=0;

        for(int i=0;i<nums.length;i++)
        {
int l=(int) Math.floor(Math.log10(Math.abs(nums[i]))) + 1;
if(l%2==0)
{
    c+=1;
}
        }
return c;
        
        
    }
}