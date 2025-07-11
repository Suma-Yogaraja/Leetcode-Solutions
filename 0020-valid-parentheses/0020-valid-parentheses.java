class Solution {
    public boolean isValid(String s) {
        //create a map that has all paranthesis,keep open paranthesis as key and closed as values
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        //Now create a stack in order to push  the open paranthesis and pop the closed paranthesis
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            //check if open paranthesis
            if (map.containsKey(c))
                stack.push(c);
            //if it is closed paranthesis
            else {
                //if stck is empty,then no matck of open paranthesis so return false
                if (stack.empty())
                    return false;
                //we got closed paranthesis ,check it against top of stack
                char closed = stack.pop();
                if (map.get(closed) != c)
                    return false;

            }
        }
        return (stack.size()==0);

    }

}