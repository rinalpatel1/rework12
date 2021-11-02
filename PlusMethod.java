package Week14HomeWork;
//overloading concept of polymorphism
public class PlusMethod {

    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        int myNum1 = plusMethodInt(2,3);
        double myNum2 = plusMethodDouble(2.2, 3.6);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}



