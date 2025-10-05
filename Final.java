// public class Final {
//     public static void main(String[] args) {
//         final int a=345;
//         final int b=345;
//         final int c=a+b;  //345+345=690
//         //c/=a;  // c=c/a; c/=a;
//         // a=568; it is error
//         System.out.println("c: "+c);
//     }
// }

// public class Final{
//     final String name;
//     Final(String n){
//         this.name=n;
//     }

//     void show(){
//         System.out.println("string is: "+name);
//     }
//     public static void main(String[] args) {
//         Final obj = new Final("VS_CODE");
//         Final second = new Final("NOTHING");
//         obj.show(); second.show();
//     }
// }


final class One{
    final void display(){
        System.out.println("this is a final statement");
    }
    void show(){
        System.out.println("this is an void method");
    }
    final void display(final int n){
        // n=18;
        System.out.println("n: "+n);
    }
}

final class Two{
    // void display(){
    //     System.out.println("this is another statement");
    // }
    final void display(){
        System.out.println("________");
    }
}
public class Final{
    public static void main(String[] args) {
        Two obj=new Two();
        obj.display();
        One two=new One();
        two.display();
        two.show();
        two.display(67);
    }
}