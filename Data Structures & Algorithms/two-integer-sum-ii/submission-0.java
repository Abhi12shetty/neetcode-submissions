class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> map = new  HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            map.put(i, numbers[i]);
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        int firstIndex = -1;
        int secIndex = -1;
        for(int i=0;i<numbers.length;i++){
            firstIndex=i;
            if(map.containsValue(target-numbers[i])){
                secIndex = valueList.indexOf(target-numbers[i]);
                break;
            }
        }
        int[] res = {firstIndex+1, secIndex+1};
        return res;
    }
}
