public class Arr4 {
    public static int getSmallest(int numbers[]){
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){

            if(Smallest>numbers[i]){
                Smallest=numbers[i];
            }
        }
        return Smallest;
    }
    public static void main(String args[]){
        int numbers[]={2,5,24,54,423,39883,39,0};
        System.out.println("the smallest number is:"+getSmallest(numbers));

    }
}
