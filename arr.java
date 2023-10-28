public class arr {
    
    public static void main(String args[]) {

        // Scanner sc=new Scanner(System.in);
        int []a[]=new int[5][];// we can leave columns as variable 
        a[0]=new int[]{0,1,3};
        a[1]=new int []{4,5,7};
        a[2]=new int []{411,55,75,34,51};
        a[3]=new int []{45,52,72,42,121};
        a[4]=new int []{41,53,74};
        a[1][2]=3;

        // System.out.println(a[1]);
        // System.out.println(a);
           for(int i=0;i<5;i++){
            for(int j=0;j<a[i].length;j++)
            System.out.print(a[i][j]+"  ");
            System.out.println("\n");
           }
           
       
    }
}
