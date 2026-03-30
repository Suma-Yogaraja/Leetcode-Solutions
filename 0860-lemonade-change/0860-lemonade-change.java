class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] denominations=new int[3];//5,10,20
        int cost=5;
        Arrays.sort(bills);
        for(int bill:bills){
            int total=bill-cost;
            switch(bill){
                case 5:
                    denominations[0]++;
                    break;
                case 10:
                    if(denominations[0]>0){
                        denominations[0]--;
                        denominations[1]++;
                    }
                    else
                        return false;
                    break;
                case 20:
                    if(denominations[1]>0 && denominations[0]>0){
                        denominations[1]--;
                        denominations[0]--;
                        denominations[2]++;
                        
                    }
                    else if(denominations[0]>2){
                        denominations[0]-=3;

                    }
                    else
                        return false;
                    break;            
            }
        }

        return true;
    }
}