class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList();
        generateSets(0,res,new ArrayList(),nums);
        return res;
    }

    public void generateSets(int idx,List<List<Integer>> res,List<Integer> curr,int[] nums){
        res.add(new ArrayList(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            generateSets(i+1,res,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}