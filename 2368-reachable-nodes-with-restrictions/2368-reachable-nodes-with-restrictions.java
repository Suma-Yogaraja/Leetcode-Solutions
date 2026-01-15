class Solution {
    int reachableNode;

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        //convert edges to adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        boolean[] seen = new boolean[n];
        reachableNode = 0;
        Set<Integer> restrict = new HashSet<>();
        for (int i : restricted)
            restrict.add(i);
        if (!restrict.contains(0))
            dfs(0, graph, seen, restrict);

        return reachableNode;
   
    }

    private void dfs(int node, Map<Integer, List<Integer>> graph, boolean[] seen, Set<Integer> restrict) {
        if (seen[node] == true)
            return;
        reachableNode++;
        seen[node] = true;
        for (int neighbour : graph.get(node)) {
            if (!seen[neighbour] && !restrict.contains(neighbour)) {
                dfs(neighbour, graph, seen, restrict);
            }
        }
        return;
    }
}