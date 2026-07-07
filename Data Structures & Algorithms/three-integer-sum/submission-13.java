class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0; int j=nums.length-1;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<String> resSet = new HashSet<String>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int temp=0;
        for(int num:nums){
            map.put(temp,num);
            temp++;
        }
        
        List<Integer> values = new ArrayList<>(map.values());
        Set<Integer> integerSet = new HashSet<>(values);
        List<Integer> integerList = new ArrayList<>(integerSet);
        if(integerList.size()==1 && integerList.get(0)==0){
            res.add(Arrays.stream(nums)
                           .boxed()
                           .collect(Collectors.toList()).subList(0, 3));
            return res;
        }
        values.sort(Comparator.naturalOrder());
        System.out.println("Array: "+Arrays.toString(nums));
        System.out.println("Map: "+map.values());
        while(j>i && nums[i]<=nums[j]){
            int sum = nums[i]+nums[j];
            int remain = 0-sum;
            int index=-1;
            if(map.containsValue(remain)){
                for(int k=0;k<map.size();k++){
                    if(map.get(k)!=null && map.get(k)==remain && k!=i && k!=j){
                        index=k;
                        break;
                    }
                }
                System.out.println("["+nums[i]+", "+nums[j]+"] ; "+"Remain(third): "+remain+" ; "+"MapIndex: "+index);
                if(index!=-1){
                    System.out.println("; ["+nums[i]+", "+nums[j]+", "+map.get(index)+"]");
                    List<Integer> a = new ArrayList<>(List.of(nums[i], nums[j], map.get(index)));
                    a.sort(Comparator.naturalOrder());
                    if(!resSet.contains(a.toString())){
                        resSet.add(a.toString());
                        res.add(a);
                    } 
                }
            }

            if(sum>=0)
                j--;
            else if(nums[j]<=0){
                i++;j=nums.length-1;
            } else {j--;}
        }
        return res;
    }
}
