public class BinarySearch {
    public static int binarySearch(int array[], int start, int end, int target){
        if(start<=end){
            int mid = start + (end-start)/2;

            // check if the target is present at mid
            if(array[mid] == target){
                return mid;
            }

            //if target is smaller than mid, it can only be present in left subarray
            if(array[mid]>target){
                return binarySearch(array, start, mid-1,target);
            }
            //target is at right subarray
            else{
            return binarySearch(array, mid+1, end, target);}
        }
        //if we are here, then the element was not present in array
        return -1;
    }

    public static void main(String[]args){
        int sortedArray[] = {2,5,8,12,16,24,38,56,79,94};
        int target = 24 ;
        int result = binarySearch(sortedArray, 0, sortedArray.length - 1,target);

        if(result == -1 ){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Element found at index" + result);
        }
    }

}
    

