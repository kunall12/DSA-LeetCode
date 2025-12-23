class Solution {
    public int maxSubArray(int[] arr) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
        }
        //but there is a problem if all the elements of array is negative it wipes all and gives output 0 which is not correct.
        //for this initialize the current sum and max sum with first element of array.
        cs=arr[0];
        ms=arr[0];
        for(int i=1;i<arr.length;i++){
            cs=Math.max(arr[i],cs+arr[i]);
            if(cs>ms){
                ms=cs;
            }
        }
        return ms;
    }
}