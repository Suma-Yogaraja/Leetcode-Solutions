class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(fn(i));
        }
        return ans;
        
    }
    private List<Integer> fn(int row){
        List<Integer> innerList=new ArrayList<>();
       if(row==0){
        innerList.add(1);
        return innerList;
       }
       else{
        innerList.add(1);
        List<Integer> prevRow=fn(row-1);
        for(int c=1;c<row;c++){
            innerList.add(prevRow.get(c-1)+prevRow.get(c));
        }
        innerList.add(1);
        return innerList;
       }

    }
  
}