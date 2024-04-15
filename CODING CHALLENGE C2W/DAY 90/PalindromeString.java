class Solution {
    int isPalindrome(String str) {
      int n=str.length();
		int start=0;
		int end=n-1;
		str=str.toLowerCase();
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return 0;
			}
			start++;
			end--;
		}
		return 1;
    }
};