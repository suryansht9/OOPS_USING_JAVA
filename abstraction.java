abstract class animal{
    abstract void walk();
    public void eat(){System.out.println("animal eats food");}
}
class dog extends animal{
    public void walk(){
        System.out.println("dog walks on 4 legs");
        
    }
}
class cat extends animal{
    public void walk(){System.out.println("cat walk in 4 legs");}
}

public class abstraction {
 public static void main(String[] args) {
    dog d1=new dog();
    cat c1=new cat();
    d1.walk();
    c1.walk();
 }   
}
