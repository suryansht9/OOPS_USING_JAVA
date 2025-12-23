
class a{public void hello(){{System.out.println("i am in method 1");}}}
class b extends a{
    public void hello(){{System.out.println("i am in method 2");}

}}
public class methodoverriding {
    public static void main(String[] args) {
        a obj1=new a();
        b obj2=new b();
        obj1.hello();
        obj2.hello();
    }

    
}
//this is an example of method overriding in java where class b extends class a and overrides the 
// hello method to provide its own implementation.
//When we create objects of both classes and call the hello method, we see different outputs
// based on the object type, demonstrating polymorphism through method overriding.
//Output:
//i am in method 1
//i am in method 2