class Solution {
    public int minStartValue(int[] nums) {
        int StValue =0;
        int currSum =0;
        int minValue = 0;

        for(int i=0;i<nums.length;i++){
            currSum =  currSum+nums[i];
                  minValue = Math.min(minValue,currSum);
                   
        }
        StValue = -(minValue)+1;
  
          
       return   StValue;




        
    }
}