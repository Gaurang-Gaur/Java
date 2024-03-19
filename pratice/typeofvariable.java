package pratice;

public class typeofvariable {
    int a=3; // instance variable 
    void fun(){
        System.out.println("I am fun");
    }

    static int ab=2;// this static object which does not require object to be used ;

    public static void main(String args[]){
        int a=20 ; //local variable


        System.out.println(a);
        System.out.println(typeofvariable.ab);
        typeofvariable type=new typeofvariable();
        System.out.println(type.a);
    }
    
}
