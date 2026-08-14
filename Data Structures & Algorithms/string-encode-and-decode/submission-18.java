class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(String s:strs){
            if(s.equalsIgnoreCase("")){
                res=res+"||#_";
            } else {
                res=res+s+"||#_";
            }
        }
        System.out.println(res);
        return res;
    }

    public List<String> decode(String str) {
        if(str.equals(""))
            return new ArrayList<String>();
        String[]a=str.split("#_");
        List<String> t = new ArrayList<String>(Arrays.asList(a));
        System.out.println(t);
        t = t.stream().map(i-> i.replace("||","")).collect(Collectors.toList());
        return t;
    }
}
