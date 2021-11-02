package Week14HomeWork;
class birds{
    public void sing(){
        System.out.println("tweet tweet");
    }
}
class parrot extends birds{
    public void sing(){
        System.out.println("mithu mithu");
    }
}
class sparrow extends birds{
    public void sing(){
        System.out.println(" chi chi");
    }
}



public class Polymorphism {
    public static void main(String[] args){
        parrot b = new parrot();
        b.sing();

    }
}
