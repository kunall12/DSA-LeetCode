class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1= version1.split("\\.");
        String[] v2= version2.split("\\.");

        int n=Math.max(v1.length,v2.length);

        for(int i=0;i<n;i++){
            int a,b=0;
            if(i<v1.length){
                a= Integer.parseInt(v1[i]);
            }else{
                a=0;
            }
            if(i<v2.length){
                b= Integer.parseInt(v2[i]);
            }else{
                b=0;
            }

            if(a>b) return 1;
            if(a<b) return -1;
        }

        return 0;
    }
}