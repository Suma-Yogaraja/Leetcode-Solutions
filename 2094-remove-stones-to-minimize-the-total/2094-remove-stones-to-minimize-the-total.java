class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int pile:piles)
            heap.add(pile);

        int stoneSum=0;
        int i=0;
        while(i<k){
            int max=heap.remove();
           // System.out.println("remove :" + max);
            //System.out.println("ciel is" +(int)Math.ceil(max/2.0) );
            heap.add((int)Math.ceil(max/2.0));
            i++;
        }
            while(!heap.isEmpty()){
                //System.out.println(stoneSum);
                stoneSum+=heap.remove();
            }

            return stoneSum;
    }
}