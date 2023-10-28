public class Arrpassing {
 // we are using static java will not create it's object 
// here function is return array
    static int [] sumofArray( ){
        
      
        return new int[] {10,20,30};// anonymous array or int a[]=new int [3] ; a[3]={1,2,3} return a;

    }
    public static void main(String args[]){
        int []a =sumofArray();
        int sum=0;

          for (int i:a){
            sum+=i;
            
        }
        System.out.println("Sum of array:" + sum);
    }

// passing array in function

    // static void sumofArray(int []a ){
    //     int sum=0;
    //     for (int i:a){
    //         sum+=i;
            
    //     }
    //     System.out.println("Sum of array:" + sum);
    // }
    // public static void main(String args[]){
    //     int []a =new int [3];
    //     a[0]=10;
    //     a[1]=20;
    // a[2]=30;
    // sumofArray(a);
    // }
}
