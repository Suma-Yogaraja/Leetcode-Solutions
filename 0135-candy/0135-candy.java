class Solution {
    public int candy(int[] ratings) {
        //greedy
        int[] candy=new int[ratings.length];
        Arrays.fill(candy,1);
        for(int i=1;i<ratings.length;i++){
            //look at left
            if(ratings[i]>ratings[i-1])
                candy[i]=candy[i-1]+1;
               //System.out.println(candy[i]);
        }
        for(int i=candy.length-2;i>=0;i--){
            //System.out.println(ratings[i]+ "  < " + ratings[i-1]);
           // System.out.println(candy[i]+ "  > " + candy[i-1]);
            if(ratings[i]>ratings[i+1]&& candy[i]<=candy[i+1]){
                candy[i]=Math.max(candy[i],candy[i+1]+1);
                
            }
           // System.out.println(i  + " : " + candy[i]);
        }
        int sum=0;
        for(int c:candy){
            sum+=c;
        }
        return sum;
    }
}