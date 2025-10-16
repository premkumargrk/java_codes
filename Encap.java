class Unit{
    private long serial_number=49304930;
    private String product_name="nestle coco bar";

    public long get_Serial(){
        return serial_number;
    }

    public String getProduct(){
        return product_name;
    }

    public void setSerial(long num){  
        serial_number=num; 
    }

    public void setProduct(String name){
        product_name=name;
    }
}


public class Encap {
 public static void main(String[] args){

    Unit input= new Unit();
    input.setSerial(10010491);
    input.setProduct("Amul coco Bar");
    long a=input.get_Serial();
    String b=input.getProduct();
    System.out.println(+a+" : "+b);
 }   
}
