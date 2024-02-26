
class Solution {
    public void solve(int index, String digits, String[] mapping, List<String> result, StringBuilder output) {
        // Base case
        if (index >= digits.length()) {
            result.add(output.toString());
            return;
        }

        // Get the current digit
        int digit = digits.charAt(index) - '0';
        String value = mapping[digit];

        // Iterate over the characters corresponding to the current digit
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            // Include the character
            output.append(ch);
            // Recursive call for the next index
            solve(index + 1, digits, mapping, result, output);
            // Backtrack
            output.deleteCharAt(output.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        if (digits.length() == 0)
            return result;
        int index = 0;
        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(index, digits, mapping, result, output);

        return result;
    }
}
