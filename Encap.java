class Unit{
    private long serial_number=493049545656530L;
    private String product_name="nestle coco bar";

    public long get_Serial(){
        return serial_number;
    }

    public String getProduct(){
        return product_name;
    }

    public void setSerial(long num){  
        serial_number=num;
        System.out.println(serial_number);
    }

    public void setProduct(String name){
        product_name=name;
        System.out.println(product_name);
    }
}


public class Encap {
 public static void main(String[] args){

    Unit input= new Unit();
    long a=input.get_Serial();
    String b=input.getProduct();
    System.out.println(+a+" : "+b);
    input.setSerial(10010494543551L);
    input.setProduct("Amul coco Bar");
 }   
}
