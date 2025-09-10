// import java.util.Arrays;
public class Collect {
    
    public static void main(String[] args){
        // int[] number={4,5,61,90}; 
        // System.out.println("first element: "+number[0]);
        // System.out.print("last element: "+number[number.length -1]);

        // int []inputs= new int[8];
        // inputs[0]=45;
        // inputs[1]=51;
        // inputs[2]=34;
        // inputs[3]=90;
        // inputs[4]=78;
        // for (int j=0; j<inputs.length; j++){
        //     System.out.println("inputs are"+j+ ": "+inputs[j]);
        // }

        // String phones[] = {"xiaomi", "oppo","oneplus","realme", "nothing"};
        // for(String k:phones){
        //     System.out.printf("the phone brands are: %s\n",k);
        // }

        // for(int i=0; i<number.length; i++){
        //     System.out.println("the values of number arr[] is: "+number[i]);
        // }
        //***************2D Array *********************/
        // int[][] matrix ={
        //     {2,3,4,5},
        //     {8,9,10},
        //     {89,12}
        // };
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         System.out.print(matrix[i][j]+ "\t");
        //     }
        //     System.out.println();
        // }

        // double[] points={5.6,3.4,99.2,23.40};
        // double max=points[0];
        // for (double init: points){
        //     if (init>max){
        //         max=init;
        //     }
        // }
        // System.out.println("max: "+max);

        // int values[]={30,11,8,1,10,4};
        // Arrays.sort(values);
        // System.out.println("sorted elements: "+Arrays.toString(values));

    //   int[] binary = {8,9,11,45,62,80};
    //   int index = Arrays.binarySearch(binary, 80);
    //   System.out.println("index is: "+index);

    // int[] source= {18,10,34,76,42};
    // int[] copy=Arrays.copyOf(source, 3);
    // int[] range=Arrays.copyOfRange(source, 2, 8);
    // System.out.println("index is: "+Arrays.toString(copy));
    // System.out.println("Range is: "+Arrays.toString(range));

    // double[] dump = new double[20];
    // Arrays.fill(dump,1.40494040);
    // System.out.println("Arrays dump is: "+Arrays.toString(dump));

    // String[] arr_1={"3","7","9"};
    // int[] arr_2={32,75,90};
    // String[] arr_3={"3","7","9"};
    // System.out.println(Arrays.equals(arr_1,arr_2));
    // System.out.println(Arrays.equals(arr_2,arr_3));
    // System.out.println(Arrays.equals(arr_3,arr_1));

    int[][] jag=new int[3][];


    jag[0] = new int[5];
    jag[1]= new int[7];
    jag[2]= new int[2];

    int value=1;

    for(int i=0; i<jag.length; i++){
        for(int j=0; j<jag[i].length; j++){
            jag[i][j]=value++;
        }
    }

    for(int i=0; i<jag.length; i++){
        for(int j=0; j<jag[i].length; j++){
            System.out.print(jag[i][j]+ "\t");
        }
        System.out.println();
    }
    }

}
