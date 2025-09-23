class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnit = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            int box = boxTypes[i][0];
            int unit = boxTypes[i][1];
            System.out.println(box + " :" + unit);
            System.out.println("trucksize is " + truckSize);
            if(truckSize<=0)
                break;
            if (box <= truckSize) {
                totalUnit += box * unit;
                // System.out.println("total unit is " +totalUnit);
                truckSize -= box;
            } else {
                box = Math.min(box, truckSize);
                //  System.out.println("box is " + box);
                totalUnit += box * unit;
                //   System.out.println("total unit is " +totalUnit);
                truckSize -= box;
            }

        }

        return totalUnit;
    }
}