class Solution {
    public String largestPalindromic(String num) {
        Map<Integer, Integer> dict = new TreeMap<>(Collections.reverseOrder());
        int[] nums = new int[num.length()];
        char[] num1 = num.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num1[i] - '0';
        }
        for (int i : nums) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }
        boolean hasOdd = false;
        int oddNum = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = dict.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == 1) {
                if (!hasOdd || entry.getKey() > oddNum) {
                        oddNum = entry.getKey();
                         hasOdd = true;
                }
                    iterator.remove();
            }
            else if (entry.getValue() % 2 != 0) {
                if (oddNum == 0 || entry.getKey() > oddNum) {
                    oddNum = entry.getKey();
                    hasOdd=true;
                }
                entry.setValue(entry.getValue() - 1);
            }
        }

    StringBuilder leftHalf = new StringBuilder();for(
    Map.Entry<Integer, Integer> entry:dict.entrySet())
    {
        int digit = entry.getKey();
        int count = entry.getValue();
        int half = count / 2;
        leftHalf.append(String.valueOf(digit).repeat(half));

    }if(leftHalf.length()>0&&leftHalf.charAt(0)=='0')
    {
        return oddNum != 0 ? String.valueOf(oddNum) : "0";
    }if(leftHalf.length()==0&&oddNum==0)
    {
        return "0";
    }

    StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();

    String ans = new String();if(hasOdd)ans=leftHalf.toString()+String.valueOf(oddNum)+rightHalf.toString();else ans=leftHalf.toString()+rightHalf.toString();

    return ans;
}}