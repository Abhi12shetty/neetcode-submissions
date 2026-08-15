class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set = new HashSet();
        for(int i:nums){
            set.add(i);
        }
        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }
            int start=num;
            int count=0;
            while(set.contains(start)){
                count++;
                start++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}