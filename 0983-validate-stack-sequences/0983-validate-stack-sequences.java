class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
      
        int j=0;
        for(int num:pushed){
            //first push the number to stack
                stack.push(num);
                //System.out.println(num);
        //now check whether that pushed num is same as pop ,if same pop that elemnt
            while(!stack.isEmpty()&& j<popped.length && stack.peek()==popped[j]){
                
                stack.pop();
                j++;
                
               // System.out.println("stack peek" + stack.peek());
               // System.out.println(j);
            }
        }
        return stack.isEmpty();
    }
}