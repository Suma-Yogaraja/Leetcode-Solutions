class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //bfs
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        if (!wordList.contains(endWord))
            return 0;
        Set<String> visited = new HashSet<>();
        Set<String> wordSet=new HashSet<>(wordList);
        int step = 1;
        visited.add(beginWord);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String s = q.poll();
                if (s.equals(endWord))
                    return step;
                for (int j = 0; j < s.length(); j++) {
                    //char[] chars=s.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        //change each character at each position untill we find that word in wordList
                        String word = move(s, j, c);
                        if (!wordSet.contains(word) || visited.contains(word)) {
                            continue;
                        }
                        visited.add(word);
                        q.offer(word);

                    }
                }

            }
            step++;
        }
        return 0;

    }

    private String move(String s, int index, char changeTo) {
        char[] chars = s.toCharArray();
        chars[index] = changeTo;
        return new String(chars);

    }
}