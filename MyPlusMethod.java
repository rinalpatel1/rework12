package Week14HomeWork;
// overloading concept of polymorphism
public class MyPlusMethod {
    static int myPlusMethodInt(int x, int y) {
        return x + y;
    }


    static float myPlusMethodfloat(float a, float b) {

        return a + b;
    }

    public static void main(String[] args) {
        int myNum1 = myPlusMethodInt(6, 2);
        float myNum2 = myPlusMethodfloat(285.567f,554.2789f);

        System.out.println("int:" + myNum1);
        System.out.println("float:" + myNum2);

    }
}
