class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        //im using int[] array to store the frequency
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // System.out.println(ch-'a');
            freq[ch - 'a']++;
        }
        //use stringbuilder to store the result array
        StringBuilder sb = new StringBuilder();
        int curr = 25;
        while (curr >= 0) {//started from z because question asked for lexicographically largest
            int j = curr - 1;
            int use = Math.min(freq[curr], repeatLimit);
            for (int x = 0; x < use; x++) {
                char c = (char) (curr + 'a');
                sb.append(c);
            }
            freq[curr] -= use;
            if (freq[curr] == 0){
                curr--;
                continue;
            }
                
            if (freq[curr] > 0) {
                //elemts are still there and we have to use it after j
                while (j >= 0 && freq[j] == 0)
                    j--;
                if (j < 0)
                    break;
                sb.append((char) (j + 'a'));
                freq[j]--;

            }
        }

        return new String(sb);

    }
}