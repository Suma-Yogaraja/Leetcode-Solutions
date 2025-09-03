class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
           // System.out.println(index);
            if(nums[index]<0)
                ans.add(index+1);
            else
                nums[index]=-nums[index];
        }
        return ans;
    }
}











//         List<Integer> ans=new ArrayList<>();
//         Set<Integer> set=new HashSet<>();
//         for(int num:nums){
//             if(set.contains(num)){
//                 ans.add(num);
//             }
//             set.add(num);
//         }
//         return ans;

//     }
// }