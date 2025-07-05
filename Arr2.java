public class Arr2 {
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,5,22,47,78,34}; // elem starts with index 0. Its a zero based indexing method
        int key=5;
        int index=LinearSearch(numbers,key);

        if(index==-1){
            System.out.println("element not found!");
        }
        else{
            System.out.println("element is found at position:"+index);
        }
    }
    
}
