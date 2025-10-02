class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int totalLen = words[0].length();
        int j = 0;
        for (int i = 1; i < words.length; i++) {
            int len = words[i].length();
            totalLen += len + 1;
            if (totalLen > maxWidth) {
                //call a function to create a lineboundry(0 to i-1)
                ans.add(createLine(j, i - 1, words, totalLen - len - 1, maxWidth, false));
                j = i;
                totalLen = words[i].length();
            }
        }
        int currLen = 0;
        for (int k = j; k < words.length; k++) {
            currLen += words[k].length();
        }
        currLen += (words.length - 1 - j); // add 1 space between each word

        ans.add(createLine(j, words.length - 1, words, currLen, maxWidth, true));
        return ans;
    }

    private String createLine(int left, int right, String[] words, int currLen, int maxWidth, boolean isLast) {
        StringBuilder sb = new StringBuilder();
        int wordCount = right - left + 1;
        // If it's the last line OR only one word → left-justify
        if (isLast || wordCount == 1) {
            for (int i = left; i <= right; i++) {
                sb.append(words[i]);
                if (i < right)
                    sb.append(" "); // single space between words
            }
            // Fill remaining spaces at the end
            int remaining = maxWidth - sb.length();
            for (int i = 0; i < remaining; i++) {
                sb.append(" ");
            }

        } else {
            int totalSpaces = maxWidth - currLen; // total extra spaces to distribute
            int gaps = wordCount - 1; // number of gaps between words
            int spacePerGap = totalSpaces / gaps;
            int extraSpaces = totalSpaces % gaps; // distribute extras to leftmost gaps
            for (int i = left; i < right; i++) {
                sb.append(words[i]);
                sb.append(" "); // one default space
                // Add additional justified spaces
                for (int s = 0; s < spacePerGap; s++) {
                    sb.append(" ");
                }
                // Add extra space to the first 'extraSpaces' gaps
                if (extraSpaces > 0) {
                    sb.append(" ");
                    extraSpaces--;
                }
            }
            sb.append(words[right]); // last word, no space after it
        }
       return sb.toString();
    }
}