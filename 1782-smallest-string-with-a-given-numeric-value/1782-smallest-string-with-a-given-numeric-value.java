class Solution {
    public String getSmallestString(int n, int k) {
        //initialize all charcater of srtring of length n to 'a';
        char[] ans=new char[n];
        int i=0;
        Arrays.fill(ans, 'a');//fill with a 
        k=k-n;
        // System.out.println("value of k after initializing is " + k);
        int last=n-1;
        while(k>=0){
            if(k+1>26 && last>=0){
               //remove last elemt and add 
               ans[last]=(char)'z';
               k=k+1-26;
            //    System.out.println(k);
               last--;
            }
            else{
                //ascii value of a
                ans[last]=(char)(k+'a');
                // System.out.println((char)(k+'a'));
                break;
            }
            
        }
        return new String(ans);
    }
}




























//         char[] ans=new char[n];
//        Arrays.fill(ans, 'a');
//         k-=n;
//         int i=n-1;
//         while(k>0 && i>=0){
//             int word=Math.min(25,k);//25 because a is already there
//             // System.out.println(k);
//             ans[i]=(char) ('a'+word);
//             k-=word;
//             i--;

//         }
        
//         return new String(ans);
//     }
// }