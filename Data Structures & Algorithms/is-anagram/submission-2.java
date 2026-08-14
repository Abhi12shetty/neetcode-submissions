class Solution {
    public boolean isAnagram(String s, String t) {
        /*HashMap<Character, Integer> map1= s.chars().mapToObj(i->(char)c)
                                    .collect(Collectors.groupingBy(i->i, Collectors.counting()));*/

        if(s.length()!=t.length())
            return false;
        
        Character[] sArr = s.chars().mapToObj(i->(char)i).toArray(Character[]::new);
        Character[] tArr = t.chars().mapToObj(i->(char)i).toArray(Character[]::new);
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
