interface First{
    int A= 56;
    public void listen();
    public void write();
    public void read();
}



interface Two extends First{
    public void Instruction();
    public void Assignment();
    public void Val();
}
class FirstClass{
    int b=56;
    String c="FistClass_statement";
//     FirstClass(int b,String c){
//         this.b=b;
//         this.c=c;
//     }
 }
class SecondClass extends FirstClass implements Two{
    public void Instruction(){
        System.out.println("the principal gave the instruction for public exam");
    }
    public void Assignment(){
        System.out.println("the class teacher gave the assignment in science to submit on tomorrow");
    }
    
    public void listen(){
        System.out.println("Student should listen what teacher taught");
    }
    public void write(){
        System.out.println("Student should write");
    }
    public void read(){
        System.out.println("Student should \"read\"");
    }
    public void Val(){
        System.out.printf("the value of a is: %d",A);
    }
    public void FirstClass_input(){
        System.out.printf("the firstclass int is %d and string is %s\n",b,c);
    }
}

public class Absface {
    public static void main(String []args){
        SecondClass pbj = new SecondClass();
        pbj.listen();
        pbj.read();
        pbj.write();
        pbj.Instruction();
        pbj.Assignment();
        pbj.Val();
        pbj.FirstClass_input();
    }
}
