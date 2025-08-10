class Solution {
    public boolean reorderedPowerOf2(int n) {

         Set<String> powerSet = new HashSet<>();
        for (int i = 0; i < 31; i++) { // 2^0 to 2^30 fits in int
            int power = 1 << i;
            powerSet.add(sortDigits(power));
        }
        
        // Check if n's sorted digits match any power of 2 pattern
        return powerSet.contains(sortDigits(n));
    }

    // Helper: returns sorted digits of a number as a string
    private String sortDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    
        
    }
}