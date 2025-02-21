//Final class 

class demo {
    void add(){
        System.out.println("CALL ADD FUNCTION");
    }

    static void minus(){
        System.out.println("CALL MINUS FUNCTION");
    }
}
public class demo1{
        void multiply(){
            System.out.println("CALL MULTI FUNCTION");
        }

        static void sub(){
            System.out.println("CALL SUB FUNCTION");
        }
    
    public static void main(String[]agrs){

        demo A = new demo();
        A.add();
        demo M = new demo();
        M.minus();

        demo1 d1 = new demo1();
        d1.multiply();
        sub();
    }
}
