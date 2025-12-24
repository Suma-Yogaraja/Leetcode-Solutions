class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //use array of size 100
        int[] freq=new int[101];//since constraint says it
        int[] ans=new int[nums.length];
        for(int num:nums){//check frequency
            freq[num]++;
            // System.out.println("num is " + num + "  its freq is " +freq[num]);
        }
        //we have freq[8]=1,freq[2]=2.... so on
        //do prefix sum
        for(int i=1;i<100;i++){
            freq[i]+=freq[i-1];
            // System.out.println("num is " + i+ "  its freq is " +freq[i]);
        }
       
        for (int i = 0; i < nums.length; i++){
           ans[i] = nums[i] == 0 ? 0 : freq[nums[i] - 1];;
        }
        return ans;
    }
}




















    //  //time complexity =o(n2)
    //  //space complexity=o(1)
    //  int[] ans=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int count=0;
    //         for(int j=0;j<nums.length;j++){
    //             if(i!=j && nums[i]>nums[j])
    //                 count++;
    //         }
    //         ans[i]=count;
    //     }
    //     return ans;
    // }
//}