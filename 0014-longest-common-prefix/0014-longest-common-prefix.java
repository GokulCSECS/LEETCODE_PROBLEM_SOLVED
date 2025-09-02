class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Step 1: Assume the first string is the prefix
        String prefix = strs[0];

        // Step 2: Compare prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep reducing prefix until the current string starts with it
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
