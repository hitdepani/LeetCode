class Solution {
    List<List<Integer>> list= new ArrayList<>();
    void sol(List<Integer> arr,List<Integer> li)
    {
        if(arr.size()==0)
        {
            list.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<arr.size();i++)
        {
            int val=arr.get(i);
            arr.remove(i);
            li.add(val);
            sol(arr,li);
            arr.add(i,val);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<Integer> li = new ArrayList<>();
        sol(arr,li);
        return list;
    }
}