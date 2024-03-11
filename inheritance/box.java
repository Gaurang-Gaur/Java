package inheritance;
public class box {
// by default here the variable are private memebers,
// we can't access them in any other file directly without having a getter function and set it value without setter function 
// to maitain encapsulation
// .Note: The whole package run at the same time so it good pratice to have only one main ( ) inside it but , if it have to main() it will not through any error
//? it will try to run the main function of that file 

//https://www.w3schools.com/java/java_encapsulation.asp

//! import this package inside the arr.java package.
   public double l;
   protected double w;

   double h;

   // creating all possible type of constructor

   box(){
    this.l=-1;
    this.w=-1;
    this.h=-1;

   }
   
   box(double sides){
    this.l=sides;
    this.h=sides;
    this.w=sides;


   }

   public box(double l, double h,double w){
    this.l=l;
    this.h=h;
    this.w=w;

   }
   // if we just copying the constructor directly 
   // like old box

   box(box old){
    this.l=old.l;
    this.h=old.h;
    this.w=old.w;
    
   }
   public double getL() {
      return l;
  }
  public double getH(){
   return h;
  }

  public double getW(){
   return w;

  }
  public static void main(String []args){

   box o=new box(3,5,555);

   System.out.println(o.w);
  }
  

    
}
