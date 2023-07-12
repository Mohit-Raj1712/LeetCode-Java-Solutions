class Solution {
    public int[] twoSum(int[] array, int target) {
        
        int N = array.length;
        int[] output = new int[] {-1, -1};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < N; i++)
        {
            int number = array[i];
            int complementNumber = target - number;
            
            if (!map.containsKey(complementNumber))
                map.put(number, i);
            else {
                
                output[0] = map.get(complementNumber);
                output[1] = i;
                break;
            }
        }
        
        return output;
    }
}