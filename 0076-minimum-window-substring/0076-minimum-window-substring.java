class Solution {

    public String minWindow(String s, String t) {
        int minLeng = Integer.MAX_VALUE;
        int minStart = 0;
        int minEnd = 0;

        if (t.length() > s.length())
            return "";
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray())
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        int start = 0;
        int end = 0;
        int need = tFreq.size();
        int have=0;
        Map<Character, Integer> temp = new HashMap<>();
        while (end < s.length()) {
            char key = s.charAt(end);
            if (tFreq.containsKey(key)) {
                temp.put(key, temp.getOrDefault(s.charAt(end), 0) + 1);
                if (temp.get(key).intValue() == tFreq.get(key).intValue()) {
                    have++;
                }
            }

                while (have == need) {
                    if (minLeng > (end - start + 1)) {
                        minLeng = end - start + 1;
                        minStart = start;
                        minEnd = end;
                    }
                    char startChar = s.charAt(start);
                    if (tFreq.containsKey(startChar)) {
                        temp.put(startChar,temp.get(startChar) - 1);
                        // System.out.println(start);
                        if (temp.get(startChar) < tFreq.get(startChar)) {
                            have--;
                        }
                    }
                    start++;
                    // System.out.println(start);
                }
            end++;
        }
        return minLeng==Integer.MAX_VALUE?"":s.substring(minStart, minStart+minLeng);
    }
}