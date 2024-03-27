public class PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        //Brute Force Method
        // int index = 0;
        // int max = arr[0];
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i]>max){
        //         index = i;
        //         max = arr[i];
        //     }
        // }
        // return index;
        //Binary Search
        int low = 0;
        int high = arr.length -1;

        while(low < high){
            int mid = low + (high - low)/2;

            if(arr[mid]< arr[mid+1]){
                low = mid+1;
            }
            if(arr[mid]>arr[mid+1]){
                high = mid;
            }
        }
        return low;

    }
}
