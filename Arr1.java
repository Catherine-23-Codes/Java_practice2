public class Arr1 {
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12,14,16,18,22,28};
        int key=28;
        int index=LinearSearch(numbers,key);
        if(index==-1){
            System.out.println("element is not found!");
        } else{
            System.out.println("element is found at index: " + index);
        }
    }
    
}
