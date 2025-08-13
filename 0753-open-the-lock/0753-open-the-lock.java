class Solution {
    public int openLock(String[] deadends, String target) {
        //this is kinda bfs problem,
        //ex: 0202 target,first move 3rd digit twice > 0200>move 1st digit once > 0201-deadend,backtrack
        //move down 1st digit 0200>0209 >0208>0207...>0202
        //start with 0000
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        //add dead end to set 
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        //edge case
        if (dead.contains(target) || dead.contains("0000")) {
            return -1;
        }
        int steps = 0;
        q.offer("0000");
        visited.add("0000");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(target))
                    return steps;
                for (int j = 0; j < 4; j++) {//4 digits so using j<4
                    //checking up direction
                    String down = move(curr, j, -1);
                    if (!dead.contains(down) && !visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                    String up = move(curr, j, 1);
                    if (!dead.contains(up) && !visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }

                }
            }
            steps++;
        }
        return -1;
    }

    private String move(String s, int index, int direction) {
        char[] chars = s.toCharArray();
        int digit = chars[index] - '0';
        digit = (digit + direction + 10) % 10;
        chars[index] = (char) (digit + '0');
        return new String(chars);
    }
}