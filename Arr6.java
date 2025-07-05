public class Arr6 {
    public static int binarySearch(int numbers[],int key){

        //imp intialisation!
        int start=0, end =numbers.length-1;

  //binary search elements must be in a sorted array form either ascending or descending order


        while(start<=end){
            int mid=(start+end)/2;  //formula

            //comparsions
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;     
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,7,8,10,22,34,45,77,89}; //must be in a sorted form 
        int key=89;
        int key2=-143;
        System.out.println("index for binary search is: "+binarySearch(numbers, key));
        System.out.println("index for binary search is: "+binarySearch(numbers, key2));
        
    }
}
    

