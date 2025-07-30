class Solution {
    public int firstUniqChar(String s) {
        //use hashmap to store character as key and its repitation as value
        //now for each charracter in s,check its value,if its 1,send that index
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1)
                return i;
        }
        return -1;
    }
}