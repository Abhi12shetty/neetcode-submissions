class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        int j=1;
        for(String st:strs){
            char[] tempArr = st.toCharArray();
            Arrays.sort(tempArr);
            String tempString = new String(tempArr);
            if(!map.containsKey(tempString)){
                List<String> newList = new ArrayList<String>(List.of(st));
                map.put(tempString , newList);
            }else{
                List<String> list = map.get(tempString);
                list.add(st);
                map.put(tempString, list);
            }
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}
