class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> dict=new HashMap<>();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        int[] values=new int[s.length()];
        for(int i=0;i<values.length;i++){
            char c=s.charAt(i);
            values[i]=dict.get(c);
            System.out.println(values[i]);
        }
        int romanValue=0;
        for(int j=1;j<values.length;j++){
            if(values[j]>values[j-1]){//IX
                romanValue-=values[j-1];
            }
            else{
                romanValue+=values[j-1];
            }
        }
        return romanValue+values[values.length-1];
    }
}