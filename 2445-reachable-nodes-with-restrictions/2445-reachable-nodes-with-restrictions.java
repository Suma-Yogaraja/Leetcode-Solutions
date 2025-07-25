class Solution {
    Set<Integer> restrict;

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        //first convert grid array to adj 
        restrict = new HashSet<>();
        int reach=0;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int edge[] : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        //initilaize the set
        for (int i : restricted)
            restrict.add(i);
        //start with node 0,call ddfs
         reach= reach+dfs(0, graph, visited);
        return reach;
    }

    int dfs(int node, Map<Integer, List<Integer>> graph, boolean[] visited) {
        //dfs check its neighbour node and check if its not in restricted set and not visited before
        int reach = 1;
        
        visited[node] = true;
        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour] && !restrict.contains(neighbour)) {
                reach += dfs(neighbour, graph, visited);
            }
        }
        return reach;
    }
}