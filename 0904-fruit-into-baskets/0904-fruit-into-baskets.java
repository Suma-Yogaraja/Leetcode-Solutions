class Solution {
    public int totalFruit(int[] fruits) {
        //finding maxwindow
        //time complexity=o(n) n-length of array fruit
        //space complexity=O(1)
        int start=0;
        int end=0;
        int maxWindow=0;
        Map<Integer,Integer> dict=new HashMap<>();
        while(end<fruits.length && start<=end){
            dict.put(fruits[end],dict.getOrDefault(fruits[end],0)+1);
            
                if(dict.size()>2){
                int value=dict.getOrDefault(fruits[start],0)-1;
                if(value==0)
                    dict.remove(fruits[start]);
                else
                    dict.put(fruits[start],value);
                start++;
                }
            end++;
            maxWindow=Math.max(maxWindow,end-start);
            // System.out.println("size of dict  is " + dict.size());
        }
        return maxWindow;
    }
}