class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //Use Set to check the exsitense of jewels in a stone
        if(jewels.length()==0)
            return 0;
        Set<Character> jewel=new HashSet<>();
        for(char c:jewels.toCharArray()){
            jewel.add(c);//add jewels to set
        }
        int numOfStone=0;
        for(char stone:stones.toCharArray()){
            if(jewel.contains(stone)){
                numOfStone++;
            }
        }
        return numOfStone;
    }
}