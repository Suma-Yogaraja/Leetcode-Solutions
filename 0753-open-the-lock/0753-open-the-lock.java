class Solution {
    public int openLock(String[] deadends, String target) {
        //BFS finding shortest path
        Queue<String> q=new LinkedList<>();
        int step=0;
        Set<String> deadend=new HashSet<>();
        for(String dead:deadends)
            deadend.add(dead);
        q.offer("0000");
        if(deadend.contains("0000"))
            return -1;
        Set<String> visited=new HashSet<>();
        visited.add("0000");
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String curr=q.poll();
                if(curr.equals(target))
                    return step;
                for(int j=0;j<4;j++){
                    //direction up and down
                    String up=move(curr,j,1);
                    if(!deadend.contains(up) && !visited.contains(up)){
                        visited.add(up);
                        q.offer(up);
                    }
                    String down=move(curr,j,-1);
                    if(!deadend.contains(down) && !visited.contains(down)){
                        visited.add(down);
                        q.offer(down);
                    }
                }
            }
                step++;
        }
        return -1;
    }
    private String move(String s,int index,int dir){
        char[] newString=s.toCharArray();
        int digit=newString[index]- '0';
        int newDigit=digit+dir;
        if(newDigit>9)
            newDigit=0;
        else if(newDigit<0)
            newDigit=9;
        newString[index]= (char)('0'+newDigit);
        return new String(newString);
    }
}