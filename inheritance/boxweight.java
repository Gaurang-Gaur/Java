package inheritance;

public class boxweight extends box{

    int weight;
    int time;


    boxweight(){
        this.time=-1;
        this.weight=-1;

        
    }
    boxweight(int l, int h,int w , int weight,int time){
        super(l,h,w);
        
        this.time=time;
        this.weight=weight;
    }

    public static void main(String args[]){
        boxweight box3=new boxweight(4,5,9,64,5);

        box box5=new boxweight(3,5,5,22,3);
        System.out.println(box5.time);


        System.out.println(box3.h+" " + box3.l+" "+box3.w+" "+box3.weight+" "+box3.time);


    }
       



    // pubic static void main()
    
}
