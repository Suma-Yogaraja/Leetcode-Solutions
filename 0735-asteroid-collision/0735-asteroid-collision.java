class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        

        for(int i:asteroids){
            boolean alive=true;
            while(!stack.isEmpty() && i<0 && stack.peek()>0){
                if((stack.peek()+i)<0){
                    stack.pop();
                    continue;
                }
                else if((stack.peek())== Math.abs(i)){
                    stack.pop();
                }
                alive=false;
                break;

            }
            if(alive){
            stack.push(i);
            //System.out.println(i);
            }

        }
       
        int[] result = new int[stack.size()];
         for (int j = stack.size()- 1; j >= 0; j--) {
            result[j] = stack.pop(); // modifies the stack (empties it)
        }
        return result;
    }
}