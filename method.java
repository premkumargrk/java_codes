public class method {

    public double validate(double cost){
        if(cost>=900.00){
          System.out.print("you have 60% discount");
          return 60.0;
        }
        else if(cost>=800.00 && cost<900.00){
            System.out.print("you have 50% discount");
            return 50.0;
        }
        else if(cost>=600.00 && cost<800.00 ){
            System.out.print("you have 35% discount");
            return 35.0;
        }
        else{
            System.out.print("Buy more to get more discount");
            return 0.0;
        }
    }

    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public String sum(String a, String b){
        return a+" "+b;
    }
    public static void main(String[] funcargs){
       method m=new method();
       m.validate(800.56);
       m.validate(160.56);
       System.out.println();
       System.out.println(m.sum(6,7));
       System.out.println(m.sum(56.9049,329.49304));
       System.out.println(m.sum(34,56,90));
       System.out.println(m.sum("java","object-oriented programming"));


       
    }
}
