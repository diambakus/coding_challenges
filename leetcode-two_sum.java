class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int[] preprocessing = new int[target+1];
        int len = nums.length;
        int diff;
        
        for (int i = 0; i <= target; i++)
             preprocessing[i] = -1; 
        
        //preprocessing
        for (int i = 0; i < len; i++) {
            diff = target - nums[i];
            if (diff >= 0)
                preprocessing[diff] = i;
        }
            
        
        boolean found = false;
        
        for (int i = 0; ((!found)&& (i < len)); i++) {
            if (preprocessing[i] == -1) continue;
            else {
                int target_minus_first = target - i;
                if ((preprocessing[target_minus_first] != -1)
                   && (nums[preprocessing[target_minus_first]] == i)) {
                    if (preprocessing[target_minus_first] < preprocessing[i]) {
                        result[0] = preprocessing[target_minus_first];
                        result[1] = preprocessing[i];
                    }else {
                        result[0] = preprocessing[i];
                        result[1] = preprocessing[target_minus_first];
                    }
                  
                    found = true;
                }     
            }
        }
            
        return result;
    }
    
    private int maxValorAbs(int[] ints) {
        int max = -1;
        
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < =0) {
                if (ints[i] * (-1) > max)
                    max = ints[i] 
            }
        }
    }
}
