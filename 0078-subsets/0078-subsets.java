// back tracking
class Solution {
    private void Subsets(int[] arr, int index,ArrayList<Integer> current,List<List<Integer>> ans) {
        
        if(index==arr.length){
            ans.add(new ArrayList<>(current));
           return ;
        }
        //add of element
        current.add(arr[index]);
        Subsets(arr,index+1,current,ans);
        //remove of element
        current.remove(current.size()-1);
         Subsets(arr,index+1,current,ans);



    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Subsets( nums,0, current,ans);
        return ans;
        
    }
}