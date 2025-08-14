class Solution {
    public String largestGoodInteger(String num) {
        //use two pointer to check freq of a number and send the max fre substring
        //create a window of size 3
           // char[] nums=num.toCharArray();
            //System.out.println(num.charAt(1));
            char max=Character.MIN_VALUE;;
            boolean found=false;
           for(int i=0;i<num.length()-2;i++){
                char first= num.charAt(i);
                char second= num.charAt(i+1);
                char third= num.charAt(i+2);
                //System.out.println(first + " " + second + " " + third);
                if(first==second && second==third){
                   // System.out.println(max);
                    if(max<first){
                        found=true;
                        max=first;
                    }
                        
                }
           }

        return found ? String.valueOf(max).repeat(3): ""; 
    }
}