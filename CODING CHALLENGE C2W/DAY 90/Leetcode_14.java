class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Iterate through characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            // Check if the character is present in the same position in the rest of the strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // If not, return the common prefix found so far
                    return strs[0].substring(0, i);
                }
            }
        }

        // If all strings have been checked, return the entire first string as the common prefix
        return strs[0];
    }
}
