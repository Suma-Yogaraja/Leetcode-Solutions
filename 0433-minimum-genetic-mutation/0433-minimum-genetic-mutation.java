class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        //similar to word ladder,here we use bfs and treat the problem as graph
        Queue<String> q=new LinkedList<>();
        Set<String> bankSet=new HashSet<>(Arrays.asList(bank));
        Set<String> visited=new HashSet<>();
        char[] words={ 'A','C','G','T'};
        int steps=0;
        // if(!bankSet.contains(endGene))
        //     return -1;
        q.add(startGene);
        visited.add(startGene);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String cell=q.poll();
                if(cell.equals(endGene))
                    return steps;
                //change a word in the string check if its there in bank
                for(int j=0;j<cell.length();j++){
                    for(char c:words){
                        String word=replace(cell,c,j);
                        //System.out.println(word);
                        if(!bankSet.contains(word) || visited.contains(word))
                            continue;    
                        visited.add(word);
                        q.offer(word);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
    private String replace(String cell,char changeTo,int index){
        char[] chars=cell.toCharArray();
        chars[index]=changeTo;
        return new String(chars);
    }
}