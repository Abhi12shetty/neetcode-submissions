class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();

        for(String s: strs){
            char[] newS =new String(s).toCharArray();
            Arrays.sort(newS);
            String sorted = new String(newS);
            if(map.containsKey(sorted)){
                List<String> list=map.get(sorted);
                list.add(s);
                map.put(sorted, list);
            } else{
                map.put(sorted, new ArrayList(List.of(s)));
            }
        }
        return new ArrayList(map.values());
    }
}
