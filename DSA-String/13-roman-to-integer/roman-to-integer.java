class Solution {
    public int romanToInt(String s) {
        int num =0;
        for(int i=0;i<s.length();i++){
            int value= roman_Value(s.charAt(i));
            if(i+1<s.length() && value<roman_Value(s.charAt(i+1))){
                num-=value;
            }else{
                num+=value;
            }
        }

        return num;
    }
    public int roman_Value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        return 1000;//for M
    }
}