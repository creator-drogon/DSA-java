public class BinarySearch {

    public int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;


        while(end>start)
        //keep iterating until end is exceeding start
        {
            int mid = start + (end - start)/2;
            if(arr[mid] > target){

                end = mid-1;
                //update end to iterate over first half of the array
                //in next iteration new end will be considered when finding value of min
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] == target) return mid;
        }
        return -1;
    }
}
