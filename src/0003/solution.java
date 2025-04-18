class Solution {
    public static int lengthOfLongestSubstring(String s) {
        String thisSubst = "";
        int longestLength = 0;
        int startIndex = 0;
        int i = 0;
        while (i < s.length()) {
            String thisChar = s.substring(i,i+1); 

            if (thisSubst.contains(thisChar)) {
                startIndex++;
                i = startIndex;
                thisSubst = "";
                continue;
            } else {
                thisSubst = thisSubst + thisChar;
            }

            longestLength = Math.max(thisSubst.length(), longestLength);
            
            i++;
        }
        return longestLength;
    }

}
