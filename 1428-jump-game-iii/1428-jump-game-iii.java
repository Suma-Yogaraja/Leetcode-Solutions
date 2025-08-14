class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        Set<Integer> visited=new HashSet<>();
        visited.add(start);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int k=q.poll();
                if(arr[k]==0)
                    return true;
                //check up directions is within boundry and not visited
                int up=k+arr[k];
                if(up<arr.length && !visited.contains(up) && up>=0){
                    visited.add(up);
                    q.offer(up);
                }
                 //check down directions is within boundry and not visited
                int down=k-arr[k];
                if(down<arr.length && !visited.contains(down) && down>=0){
                    visited.add(down);
                    q.offer(down);
                }
            }
        }
        return false;
    }
}