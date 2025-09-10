public class Loop {

    public static void main(String[] args){
        int i,j;
        for(i=5; i>=1; i--){
            for (j=1; j<=i; j++){
                System.out.print("%");
            }
            System.out.print("\n");
        }
        // int count=0;
        //  for(int ih=0; ih<=20; ih++){
        //     count+=ih;
        //     System.out.println(ih);
            
        // }

        // for(int m=1, n=20, k=10; m<=k && n>=k; m++, n--){
        for (int m=1, n=20; m<=n; m++, n--){
            System.out.println("m = " + m + ", n = " + n);
        }
        // System.out.println(count);
    }   
}
