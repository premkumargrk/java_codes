public class Sup {
    public static class First{
        int a;
        First(int a){
            this.a=a;
        }
        public void display(int a){
            System.out.printf("this is value of a is %d\n:",a);
        }
    }
    public static class Second extends First{
        int b;
        Second(int a, int b){
            super(a);
            this.b=a+b;
        }
        public void display(int a,int b){
            System.out.printf("this is value of b is %d\n:",b);
        }
    }
    public static class Third extends Second{
        int c;
        Third(int a, int b, int c){
            super(a,b);
            this.c+=a+b;
            
        }
        public void display(int a, int b,int c){
            System.out.printf("this is value of c is %d\n",c);
        }
    }


    public static void main(String[] args){
        Third three = new Third(7,8,7);
        three.display(6,7);

    }
}
