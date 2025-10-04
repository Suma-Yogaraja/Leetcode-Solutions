class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1)
            return false;
        Map<Character,Character> dict=new HashMap<>();
        dict.put('(',')');
        dict.put('{','}');
        dict.put('[',']');
       Stack<Character> stack=new Stack<>();
       for(char c:s.toCharArray()){
            if(dict.containsKey(c)){//open bracket
                stack.push(dict.get(c));
            }
            else{
                if(!stack.isEmpty() && c==stack.peek()){
                    stack.pop();
                 } 
                else
                     return false;
            }
        }
    return stack.isEmpty();
}
}
       