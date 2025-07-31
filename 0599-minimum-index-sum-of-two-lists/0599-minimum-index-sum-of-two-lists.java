class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        //create a map with string as key and value as index for list1 ans list 2
        //traverse through each string in list1,check whether it is in list 2,if so take that value and add and check min
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        int min=Integer.MAX_VALUE;;
        List<String> res=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
        }
        // for(int i=0;i<list2.length;i++){
        //     map2.put(list2[i],i);
        // }
        for(int j=0;j<list2.length;j++){
            int sum=0;
            if(map1.containsKey(list2[j])){
                sum=j+map1.get(list2[j]);
                if(sum<min){
                    min=sum;
                    res.clear();
                    res.add(list2[j]);
                }
                else if(sum==min){
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}