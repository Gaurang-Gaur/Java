
import java.util.Scanner;



public class input {

    public static void main(String args[]){

        int a;

        System.out.println("Enter data ");
        Scanner o=null;
        try{
            o=new Scanner(System.in);
            

            a=o.nextInt();
    
            System.out.println("here is value of a:"+a);
        }
        finally{

            if(o!=null){
                o.close(); // closing the oject to prevent resource leakage...
            }
        }




    }
    
}
