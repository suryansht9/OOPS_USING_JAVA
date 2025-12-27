class a{
    void sum(int a,int b){
        System.out.println(a+b);}
    }
class b extends a{
    void sum(int a){
        System.out.println(a);}
    }
class c extends b{
    void sum(int a,int b){
        System.out.println("value of a is " + a + " and value of b is " + b);
    }
}
public class methodoverload2 {
    public static void main(String[] args) {
        c obj=new c();
        obj.sum(5);
        obj.sum(10,20);
        
        
    }
}
