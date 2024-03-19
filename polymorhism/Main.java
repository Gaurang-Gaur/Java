package polymorhism;

public class Main {
    
    public static void main(String []args){

        shape shape1=new shape();
        circle circle1=new circle();
        square square1=new square();
        rectangle rectangle1=new rectangle();


        // System.out.print(shape1.area());
        shape1.area();
        circle1.area();
        square1.area();
        rectangle1.area();

        // this time to create the object which have different reference type and object type

        shape sha=new circle();

        sha.area();
    }
}
