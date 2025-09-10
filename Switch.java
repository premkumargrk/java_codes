public class Switch {
 public static void main(String[] args){
    int a,b;
    a=50;
    b=50;
    String output="";
    switch(a+b){
        case 50 -> output = "it is fifty";
        case 60 -> output = "it is sixty";
        case 80 -> output = "this is eighty";
        case 90 -> output = "this is ninty";
        case 100 -> output = "this is hundred";
        
    }
    System.out.printf("the output is %s",output);
 }   
}
