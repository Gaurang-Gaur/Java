package interfacedfirst;

public  class car implements engine, media, brake {

    @Override
    public void brakePower(){
    System.out.println("I am implemenation of breaking power");
    }
    @Override
    public void mediavolume(){
    System.out.println("I am implemenation of media power");
    }
    @Override
    public void start(){
    System.out.println("I am implemenation of start");
    }
   
    
}
