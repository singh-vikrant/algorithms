class Solution {
    public int countTestedDevices(int[] arr) {
        int tested = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]-tested>0){
                tested++;
            }
        }return tested;
    }
}