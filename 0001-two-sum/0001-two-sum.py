class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result=[0,0]
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if(nums[i]+nums[j]==target):
                    result[0]=i
                    result[1]=j
                    return result

        return null