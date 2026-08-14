class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();

        for(String s: strs){
            char[] newS =s.toCharArray();
            Arrays.sort(newS);
            String sorted = new String(newS);
            map.computeIfAbsent(sorted, i->new ArrayList<>()).add(s);
        }
        return new ArrayList(map.values());
    }
}
