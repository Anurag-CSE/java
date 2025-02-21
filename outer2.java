package mypack;
public class outer2{
    int num = 10;
    int show(){
        
        System.out.println("inner class");
        return num;
    }
    class inner {
        
        void print(){
            outer2 o = new outer2();
            int num2 = 20;
            System.out.println("outer class");
            int sum = o.num + num2;
            System.out.println(sum);
            
        }        
    }
//     public static void main(String[] agrs){
//         outer2 o = new outer2();      //call outer class
//         o.show();

//         outer2.inner i = o.new inner();  //call inner class
//         i.print();
        
        
//     }
public static void fuum(){
            outer2 o = new outer2();      //call outer class
            o.show();
    
            outer2.inner i = o.new inner();  //call inner class
            i.print();
            
            
        }
}
