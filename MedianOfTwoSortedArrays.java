public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        double median = 0.0;
        List<Integer> mergedArr = new ArrayList<Integer>();

        for(int i = 0; i<nums1.length;i++){
            mergedArr.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length;i++){
            mergedArr.add(nums2[i]);
        }
        Collections.sort(mergedArr);
        int length = mergedArr.size();
        if(length % 2==0){
            median = (double)(mergedArr.get((length/2)-1) + mergedArr.get(length/2))/2;
        }else{
            median = (double)(mergedArr.get(length/2));
        }

        return median;
    }
}
