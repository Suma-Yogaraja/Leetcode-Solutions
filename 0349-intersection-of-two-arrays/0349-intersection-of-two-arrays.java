class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //keep both array in 2 sets and check for intersextion elemnts
        //this way we can remove duplicates
        //sort both the array and take tow pointers,check if elemnt at i=i-1,if so duplicate is present
        //soincrement the pointer ,same holds for other array
        Set<Integer> num1=new HashSet<>();
        Set<Integer> num2=new HashSet<>();
        //int k=0;
        List<Integer> result=new ArrayList<>();
        for(int i:nums1){
            num1.add(i);
        }
        for(int i:nums2){
            num2.add(i);
        }
        for(int j:num1){
            if(num2.contains(j)){
                result.add(j);
            }
        }
        int[] res=result.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }
}