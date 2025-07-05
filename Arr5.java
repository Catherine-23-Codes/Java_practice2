public class Arr5 {
    public static int getLargestSmallest(int numbers[]){
        int Largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
        if(Largest<numbers[i]){
            Largest=numbers[i];
        }
        if(Smallest>numbers[i]){
            Smallest=numbers[i];
        }
    }
    System.out.println("the smallest number is:"+ Smallest);
    return Largest;
}
public static void main(String args[]){
    int numbers[]={23,34783,-38,30,58,19,-288};
    System.out.println("the largest number is:"+getLargestSmallest(numbers));
}
}
