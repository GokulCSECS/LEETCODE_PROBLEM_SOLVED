class Solution {
    public int subarrayBitwiseORs(int[] arr) {

         Set<Integer> res = new HashSet<>();
        Set<Integer> curr = new HashSet<>();

        for (int num : arr) {
            Set<Integer> next = new HashSet<>();
            
            // OR current number with all subarrays ending previously
            next.add(num);
            for (int val : curr) {
                next.add(val | num);
            }
            
            curr = next;
            res.addAll(curr);
        }
        
        return res.size();
        
    }
}