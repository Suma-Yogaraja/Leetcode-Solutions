class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        //min window substring
        Map<Character, Integer> dict = new HashMap<>();
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minEnd = 0;
        int minLen = Integer.MAX_VALUE;
        for (char c : t.toCharArray())
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        Map<Character, Integer> temp = new HashMap<>();
        int need = dict.size();
        int have = 0;
        while (end < s.length()) {
            char key = s.charAt(end);
            if (dict.containsKey(key)) {
                temp.put(key, temp.getOrDefault(key, 0) + 1);
                if (dict.get(key).intValue()== temp.get(key).intValue()) {
                    have++;
                    System.out.println("i have this character" + key);
                }
            }
            while (have == need) {
                int len = end - start + 1;
                if (len < minLen) {
                    minStart = start;
                    minLen = len;
                }
                //shrink the window
                if (dict.containsKey(s.charAt(start))) {
                    temp.put(s.charAt(start), temp.getOrDefault(s.charAt(start), 0) - 1);
                    if (dict.get(s.charAt(start)) > temp.get(s.charAt(start))) {
                        have--;
                    }
                }
                start++;
            }
            end++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}