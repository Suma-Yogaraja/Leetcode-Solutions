class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false;
        //use treemap to sort and keep freq
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int n:hand)
            map.put(n,map.getOrDefault(n,0)+1);
        
        while(!map.isEmpty()){
            int start=map.firstKey();
            int count=map.get(start);//no of groups we have to form
            for(int i=0;i<groupSize;i++){
                int card=start+i;
                if(!map.containsKey(card) || map.get(card)<count)
                    return false;
                if(map.get(card)==count)
                    map.remove(card);
                else
                    map.put(card,map.get(card)-count);
            }
            
        }
        return true;
        
    }
}