class Solution {
    public int myAtoi(String s) {
        long num=0;
        //first condition
        s= s.trim();
        if(s.isEmpty()){
            return 0;
        }

        //second conditon
        int i=0;
        int sign=1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign=(s.charAt(i)=='-')? -1:1;
            i++;
        }

        //next condition
        int n=s.length();
        while(i<n && Character.isDigit(s.charAt(i))){
            //convert the string to integer using ascii 
            num= (num*10)+s.charAt(i)-'0';
            //rounding
            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) num*sign;

    }
}