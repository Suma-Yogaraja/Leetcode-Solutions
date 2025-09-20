class Solution {
    public void rotate(int[] nums, int k) {
        //edge case
        k=k%nums.length;
        if(k==0)
            return;
        //use reversing
        //first reverse the entire array[7 6 5 4 3 2 1]
        //reverse first k elemnts[5 6 7 4 3 2 1]
        //reversek+1 to nums.length-1 elemnts[5 6 7 1 2 3 4]
        
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}




















//         //1234567 -> 5671234
//         k=k%nums.length;
//         if(k==0)
//             return;
//         Queue<Integer> q=new LinkedList<>();
//         int j=0;
//         for(int i=0;i<=nums.length-k-1;i++)//i=0;i<7-3=4
//             q.offer(nums[i]);
//         for(int i=nums.length-k;i<nums.length;i++)//i=3
//             nums[j++]=nums[i];
//             //System.out.println(q.size());
//         while(!q.isEmpty())
//             nums[j++]=q.poll();  

//     }
// }
// //       //there are many ways to solve this im using dumb answer thinking of getting proper solution
// //         k=k%nums.length;
// //         reverse(nums,0,nums.length-1);
// //         reverse(nums,0,k-1);
// //         reverse(nums,k,nums.length-1);
       
// //     }
// //     private void reverse(int[] nums,int start,int end){
// //         while(start<end){
// //             int temp=nums[start];
// //             nums[start]=nums[end];
// //             nums[end]=temp;
// //             start++;
// //             end--;
// //         }
// //     }
// // }