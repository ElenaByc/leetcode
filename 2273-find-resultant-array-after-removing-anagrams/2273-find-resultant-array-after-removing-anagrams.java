class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> list = new ArrayList<>();
        
        for(String s : words){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String curr = String.valueOf(ch);
            if(!curr.equals(prev)){
                list.add(s);
                prev=curr;
            }
        }
        return list;
    }
}