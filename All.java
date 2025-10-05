// import mypackage.others.Array;
// import mypackage.Maths;
import mypackage.*;
public class All {
    public static void main(String[] args) {
    Array arr=new Array();
    int []num={56,32,10,23,8,18,90,34};
    arr.sortArray(num);
    arr.findMax(num);

    Strings s=new Strings();
    s.reverse("customize");
    s.toUppercase("java");

    Maths m=new Maths();
    m.square(45.9434);
    m.squareRoot(56.433);
    }
    
}
