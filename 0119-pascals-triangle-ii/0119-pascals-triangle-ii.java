class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        if(rowIndex==0){
            row.add(1);
            return row;
        }
        else{
            List<Integer> prevRow=getRow(rowIndex-1);
            row.add(1);
            for(int i=1;i<rowIndex;i++){
                row.add(prevRow.get(i-1)+prevRow.get(i));
            }
            row.add(1);
            return row;
        }
    }
}