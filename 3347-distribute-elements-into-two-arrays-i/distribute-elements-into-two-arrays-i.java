class Solution {
    public int[] resultArray(int[] nums) {
    
            int[] arr1 = new int[nums.length];
            int[] arr2 = new int[nums.length];
    

        int ct = 0;
        int ct1 = 0;
        arr1[ct] = nums[0];
        arr2[ct1] = nums[1];

        for(int i=2; i<nums.length; i++){
            if(arr1[ct] > arr2[ct1]){
                ct++;
                arr1[ct] = nums[i];
            }else{
                ct1++;
                arr2[ct1] = nums[i];
            }
        }

        int[] array = new int[nums.length];
        int count = 0;
        for(int i=0; i<= ct; i++){
            array[count++] = arr1[i];
        }
    
        for(int i=0; i<= ct1; i++){
            array[count++] = arr2[i];
        }

        return array;

    }
}