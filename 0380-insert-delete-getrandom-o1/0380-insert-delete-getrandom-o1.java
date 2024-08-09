class RandomizedSet {
    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map ;
    private Random random ;

    

    public RandomizedSet() {
        int val;
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
        

        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }

        list.add(val);
        map.put(val,list.size()-1);

        return true;

        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        if(val == list.get( list.size()-1 ) ){
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }

        int idx =map.get(val);
        int lastElement = list.get(list.size()-1);

        list.set(idx, lastElement);
        map.put(lastElement, idx);
        list.set(list.size()-1, val);
        list.remove(list.size()-1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int rand = random.nextInt(list.size());
        return list.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */