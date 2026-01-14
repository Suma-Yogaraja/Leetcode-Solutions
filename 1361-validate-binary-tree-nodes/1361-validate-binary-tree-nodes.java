class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        //here find indegree for each node
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            if(leftChild[i]!=-1)
                indegree[leftChild[i]]++;
            if(rightChild[i]!=-1)
                indegree[rightChild[i]]++;
        }
        int root=-1;
        //indegree for all node except root should be 1
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                if(root==-1)
                    root=i;
                else
                    return false;
            }
            if(indegree[i]>1)
                return false;
            
        }
        if(root==-1)
            return false;
    
        //here we gor root and now we should check for cycle and reachable nodes
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
                int node=q.poll();
                if(visited[node]==true)
                    return false;//cycle exists
                visited[node]=true;
                if(leftChild[node]!=-1)
                    q.offer(leftChild[node]);
                if(rightChild[node]!=-1)
                    q.offer(rightChild[node]);
            
        }
        int count=0;
        for(boolean visit:visited){
            if(visit)
                count++;
        }
        return count==n;
    }
}