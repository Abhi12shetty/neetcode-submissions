class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i=0, j=0;
        Map<Character, Long> s1Map = s1.chars().mapToObj(k->(char)k).collect(Collectors.groupingBy(k->k, LinkedHashMap::new, Collectors.counting()));
        System.out.println(s1Map.keySet());
        Map<Character, Long> s2Map = new HashMap<>();

        while(j<s2.length()){
            if(s1Map.equals(s2Map)) return true;
            if(j-i+1 > s1.length()){
                System.out.println("removing: "+s2.charAt(i));
                s2Map.computeIfPresent(s2.charAt(i), (k, v) -> v == 1 ? null : v - 1);
                System.out.println("value: "+s2Map.get(s2.charAt(i)));
                i++;
                continue;
            }
            long current = s2Map.getOrDefault(s2.charAt(j), 0L)+1;
            if(s1Map.containsKey(s2.charAt(j)) && current<=s1Map.get(s2.charAt(j))){
                
            }
            s2Map.put(s2.charAt(j),current);
            j++;
        }
        System.out.println(s2Map.keySet());
        if(s1Map.equals(s2Map)) return true;
        return false;
    }
}
