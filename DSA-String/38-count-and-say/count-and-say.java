class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";

        String say=countAndSay(n-1);
        StringBuilder res= new StringBuilder();
        // String res="";
        int count=0;

        for(int i=0;i<say.length();i++){
            count++;
            if(i==say.length()-1 || say.charAt(i)!=say.charAt(i+1)){
                res.append(count).append(say.charAt(i));
                count=0;
            }
        }

        return res.toString();
    }
}