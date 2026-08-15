class Solution {
    public static final String seperator = Character.toString((char)257);
    public String encode(List<String> strs) {
        if(strs.size()==0){
            return Character.toString((char)258);
        }
        StringBuilder sb = new StringBuilder("");
        for(String s: strs){
            sb.append(s).append(seperator);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258)))
            return new ArrayList();
        return Arrays.asList(str.split(seperator,-1));
    }
}
