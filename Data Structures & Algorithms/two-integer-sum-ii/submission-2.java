class Solution {

    private int binarySearch( int start, int end, int num, int[] numbers){

        while(start <= end) {
            int mid = (start+end)/2;
            if(numbers[mid] == num) return mid;
            else if(numbers[mid] > num) {
                end = mid-1;
            }
            else start = mid+1;
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        for(int i=0; i < numbers.length; i++) {
            int index = binarySearch(i+1, numbers.length-1, target-numbers[i], numbers);

            if(index != -1) {
                result[0] = i+1;
                result[1] = index+1;
                return result;
            }
        }
        return result;       
    }
}
