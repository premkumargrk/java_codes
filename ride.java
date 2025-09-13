class Parent{
    void gene(){
        System.out.println("we have to be kind");
    }
}

class Child extends Parent{
    void gene(){
        System.out.println("we are not to be kind now");
    }
}
class SubChild extends Child{
    void gene(){
        System.out.println("we are using AI and not taking care of humans anymore");
    }
}
public class ride {
    public static void main(String[] a){
        Parent d ;
        Parent g=new Parent();
        g.gene();

        d=new Child();
        d.gene();

        d=new SubChild();
        d.gene();
    }
}
