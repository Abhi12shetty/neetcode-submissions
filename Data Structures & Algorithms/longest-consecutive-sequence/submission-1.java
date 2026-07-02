class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        if(nums.length<=0 || nums.length<=1){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        Set<Integer> sortedSet = new TreeSet<>(set);
        Map<Integer, Integer> map = new HashMap<>();
        int lastDig=-99;
        List<Integer> copy = new ArrayList<>(sortedSet);
        int mapValue=copy.get(0);
        for(int num:sortedSet){
            if(num==copy.get(0)){
                map.put(num, 1);
                lastDig=num;
                continue;
            }
            if(num==(lastDig+1)){
                map.put(mapValue, (map.get(mapValue)+1));
                lastDig=num;
            } else {
                map.put(num, 1);
                mapValue=num;
                lastDig=num;
            }

        }
        Collection<Integer> values = map.values();
        int big=-99;
        for(int v:values){
            if(v>big){
                big=v;
            }
        }
        System.out.println(values);
        return big;
    }
}
