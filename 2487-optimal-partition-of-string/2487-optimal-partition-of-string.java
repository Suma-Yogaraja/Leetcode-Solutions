class Solution {
    public int partitionString(String s) {
        //question ask for substring with unique character so i can use set 
        Set<Character> set=new HashSet<>();
        int substringNum=1;;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                //we can count a new substring from here
                set.clear();//clear all elemnts from set
                // set.add(c);//append this as new element
                substringNum++;
            }
            
                set.add(c);
            
        }
        return substringNum;
    }
}