import java.util.*;
class Solution {
    public void Subsets(int[] arr,int index,ArrayList<Integer> current,List<List<Integer>> ans){

        if(index==arr.length){
            ans.add(new ArrayList<Integer>(current));
             return;
        }
        //add of element 
        
            
        current.add(arr[index]);
        Subsets(arr,index+1,current,ans);
        
        current.remove(current.size()-1);

       while (index + 1 < arr.length && arr[index] == arr[index + 1])
        {
               index++;
               }
        
      
        Subsets(arr,index+1,current,ans);

       
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        Subsets(nums,0,current,ans);
        return ans;
        
    }
}