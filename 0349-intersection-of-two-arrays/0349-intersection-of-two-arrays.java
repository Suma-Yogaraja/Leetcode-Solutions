class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //keep both array in 2 sets and check for intersextion elemnts
        //this way we can remove duplicates
        //sort both the array and take tow pointers,check if elemnt at i=i-1,if so duplicate is present
        //soincrement the pointer ,same holds for other array
        Set<Integer> num1=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        for(int i:nums1){
            num1.add(i);
        }
        for(int i:nums2){
            if(num1.contains(i)){
                result.add(i);
            }
        }
        int[] res=new int[result.size()];
        int k=0;
        for(int j:result){
            res[k]=j;
            k++;
        }
        return res;
    }
}









//         for(int i:nums2){
//             num2.add(i);
//         }
//         for(int j:num1){
//             if(num2.contains(j)){
//                 result.add(j);
//             }
//         }
//         int[] res=result.stream().mapToInt(Integer::intValue).toArray();

//         return res;
//     }
// }