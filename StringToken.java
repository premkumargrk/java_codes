import java.util.StringTokenizer;

public class StringToken {
    public static void main(String args[]){
        String car= "FerrariTMercedes#Red_bull|Mclaren*alphine";
        StringTokenizer st= new StringTokenizer(car,"T|_#*");
        System.out.println("Token using multiple delims: ");
        System.out.println("total token count: "+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
