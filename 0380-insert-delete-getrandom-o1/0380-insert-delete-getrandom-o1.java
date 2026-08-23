class RandomizedSet {
    HashMap<Integer, Integer>hm;
    Random random;
    ArrayList<Integer>list;

    public RandomizedSet() {
        hm=new HashMap<>();
        random=new Random();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!hm.containsKey(val)){
            hm.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)){
            
            return false;
        }
        int index=hm.get(val);
        int last=list.get(list.size()-1);
        hm.put(last, index);
        list.set(index, last);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        int index=random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */