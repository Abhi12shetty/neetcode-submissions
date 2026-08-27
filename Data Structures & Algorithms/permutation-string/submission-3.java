class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i=0, j=0;
        Map<Character, Long> s1Map = s1.chars().mapToObj(k->(char)k).collect(Collectors.groupingBy(k->k, LinkedHashMap::new, Collectors.counting()));
        Map<Character, Long> s2Map = new HashMap<>();

        while(j<s2.length()){
            if(s1Map.equals(s2Map)) return true;
            if(j-i+1 > s1.length()){
                s2Map.computeIfPresent(s2.charAt(i), (k, v) -> v == 1 ? null : v - 1);
                i++;
                continue;
            }
            long current = s2Map.getOrDefault(s2.charAt(j), 0L)+1;
            s2Map.put(s2.charAt(j),current);
            j++;
        }
        if(s1Map.equals(s2Map)) return true;
        return false;
    }
}
