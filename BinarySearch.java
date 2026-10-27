class BinarySearch{
    static int BinarySearch(int[]arr,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return BinarySearch(arr,target,mid+1,right);
        }
        return BinarySearch(arr,target,left,mid-1);
    }
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,60};
        int target=30;

        int result=BinarySearch(arr,target,0,arr.length-1);
        System.out.println(result);
    }
}