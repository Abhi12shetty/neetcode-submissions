class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        int j=1;
        for(String st:strs){
            char[] tempArr = st.toCharArray();
            Arrays.sort(tempArr);
            String sortedString = new String(tempArr);
            if(!map.containsKey(sortedString)){
                List<String> newList = new ArrayList<String>(List.of(st));
                map.put(sortedString , newList);
            }else{
                List<String> list = map.get(sortedString);
                list.add(st);
                map.put(sortedString, list);
            }
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}
