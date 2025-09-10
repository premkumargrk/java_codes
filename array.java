class array{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        System.out.println("The array elements are: ");
        for(int arr1:arr){
            System.out.println(arr1);

            String [] cars={"BMW","Ford","Audi","Toyota"};
            for(String k:cars){
                System.out.println(k);
            }
        }
        }
        
        int[][] jagged = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];

        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
        }

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
 
    }
}
    
