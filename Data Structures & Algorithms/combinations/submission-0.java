class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>list = new ArrayList<>();
        backtrack(n,k,0,list);
        return ans;
    }
    public void backtrack(int n, int k , int num, List<Integer>list){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = num+1;i<=n;i++){
            list.add(i);
            backtrack(n,k-1,i,list);
            list.remove(list.size()-1);
        }
    }
}