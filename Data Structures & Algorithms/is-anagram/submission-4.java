class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        
        /*Character[] sArr = s.chars().mapToObj(i->(char)i).toArray(Character[]::new);
        Character[] tArr = t.chars().mapToObj(i->(char)i).toArray(Character[]::new);
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);*/

        int[] counter = new int[26];
        for(int i=0; i<s.length();i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int i:counter){
            if(i!=0)
                return false;
        }
        return true;
    }
}
