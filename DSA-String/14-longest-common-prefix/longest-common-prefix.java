class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            String current=strs[i];
            //shrink while prefix not detected
            while(!current.startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;
    }
}