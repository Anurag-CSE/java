
class base {
    base(){
        System.out.println("in base");
    }    
}
class derived extends base{
    derived(){
        System.out.println("in derived");
    }
    public static void main(String[] agrs){
        derived d= new derived();
    }
}