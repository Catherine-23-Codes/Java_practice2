public class Arr3 {
    public static int getLargest(int numbers[]){  //int = return type    //getLargest= function name

        int largest=Integer.MIN_VALUE; // -infinity   smallest possible negative value

        for(int i=0;i<numbers.length;i++){  //loop till the end of the list in array elements
            if(largest<numbers[i]){      //if largest is less than greatest element in array then upadte it 

                largest=numbers[i];    // for updating the largest element!
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={2,5,60,77,12,34,45};
        System.out.println("the largest number is:"+getLargest(numbers)); //calling the function.
    }                                                     // here in numbers no need to specify the array format.
}
