class Solution {
    public String largestNumber(int[] nums) {
        //find max number first
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++)
            sb.append(strNums[i]);
        return new String(sb.toString());

    }
}