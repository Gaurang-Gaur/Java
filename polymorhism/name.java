package polymorhism;

public class name extends Object {
    
    int num=0;

    name(int n){
        this.num=n;
    }
    @Override
    public String toString() {
        return "i am overiding ";
    }
    public static void main(String []args){

        name obj=new name(35);

        System.out.println(obj);
    }
}
