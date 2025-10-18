package mypackage;
import java.util.Arrays;

public class Array {
    public void sortArray(int []arr){
        Arrays.sort(arr);
        System.out.println("sorted: "+Arrays.toString(arr));
    }
    public void findMax(int []arr){
        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println("max: "+max);
    }
    
}
