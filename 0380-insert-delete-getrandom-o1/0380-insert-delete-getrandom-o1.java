class RandomizedSet {
   private Set<Integer> set;
    private Random rd;
    public RandomizedSet() {
         rd = new Random();
        set = new LinkedHashSet<>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
        
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        int ind = rd.nextInt(set.size());
        int i=0;
        for(int val : set){
            if(i == ind) return val;

            i++;
        }
        return -1;
    
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */