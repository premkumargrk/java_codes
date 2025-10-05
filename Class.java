class Car{
    String name; 
    int number_plate;
    Car (String name, int number_plate){
        this.name=name;
        this.number_plate=number_plate;
    }
    void info(){
        System.out.println("name: "+name+" "+"number_plate: "+number_plate);
        // return name+""+number_plate;
    }
}

class Car2 extends Car{
    String owner;
    Car2(String name, int number_plate, String owner){
    super(name, number_plate);
    this.owner=owner;
    }

    void info_2(){
        System.out.println("name: "+name+" "+"number_plate: "+number_plate+"owner: "+owner);
    }
}

public class Class {

    public static void main(String[] args) {
        Car i = new Car("Xiaomi", 9023);
        i.name="Hyundai";
        i.number_plate=9087;
        i.number_plate+=10000;
        i.info();

        Car2 two=new Car2("Xiaomi", 9023, "Xi jingping");
        two.info_2();
    }
}
