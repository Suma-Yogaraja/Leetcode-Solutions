class RandomizedSet {
    private Map<Integer,Integer> map;
    private List<Integer> arrayList;
    private Random rand;
    public RandomizedSet() {
        map=new HashMap<>();
        arrayList=new ArrayList<>();
        rand=new Random();

    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        arrayList.add(val);
        int index=arrayList.size()-1;
        map.put(val,index);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int index=map.get(val);
        int lastElement = arrayList.get(arrayList.size()-1);
        arrayList.set(index,lastElement);
        arrayList.remove(arrayList.size()-1);
        map.put(lastElement, index);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */