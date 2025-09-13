public class func{

    protected int add(int a, int b){
        return a+b;
    }

    public static int addition(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }

    public double validate(double cost){
        if(cost>=900.00){
            System.out.print("you have 60% discount");
            return 0.60;
        }else if(cost>=800.00 && cost<900.00){
            System.out.print("you have 50% discount");
            return 0.50;
        }else if(cost>=500.00 && cost<800.00){
            System.out.print("you have 40% discount");
            return 0.40;
        }else if(cost<500.00){
            System.out.print(":you have 20% discount");
            return 0.20;
         }else {
            System.out.print("buy more and get discount");
            return 0.0;
        }
    }

    public static int value(int b,int c){
        return c+b;
    }
    public static int value(int b,int c, int d){
        return (b+c)*d;
    }
    public static int value(int c,int d,int f, int g){
        return c+d-f/g;
    }
    public static String value(String c,String d){
        return c+"<--->"+d;
    }


    public static void main(String[] a){

        System.out.println(value(5,6));
        System.out.println(value(5,6,8));
        System.out.println(value(10,6,9,10));
        System.out.println(value("Method","overloading"));


        System.out.println(Math.abs(-90));
        System.out.println(Math.min(56,23));
        System.out.println(Math.max(56,90));
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(8.9));
        System.out.println(Math.random()*2);
        System.out.println(Math.round(9.5390));
        System.out.println(Math.pow(2,1));
        System.out.println(Math.nextAfter(2.0,1.1));
        System.out.println(Math.cbrt(256));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.copySign(45.9033459459350593,-92.4934084));
        System.out.println(Math.nextUp(-45.9302));
        System.out.println(Math.nextDown(65.9404));
        System.out.println(Math.signum(0.000f));
        System.out.printf("%.5f\n",5+Math.random());
        System.out.println(Math.multiplyExact(45,20));
        double value=45.0/0;
        System.out.println(Math.log(value));
        System.out.println(Math.log10(67));
        System.out.println(Math.exp(5));
        func g=new func();
        int f=g.add(6,7);

        System.out.println("without static"+f);
        // System.out.println("the addition of a and b is: "+add(5,6));
        System.out.println("add:"+addition(f,f));
         System.out.println("sub:"+subtract(f,f));
          System.out.println("mul:"+multiply(f,f));

        double discount=g.validate(800.567);
        System.out.println(discount);
        String HG="string";
        System.out.println(HG.length());
}
}
