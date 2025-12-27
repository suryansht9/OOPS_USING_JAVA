class a{
    void show(){
        System.out.println("in class a");}
    }
class b extends a{
    void show(){
        System.out.println("in class b");
    }}
class c extends b{
    void show(){
        System.out.println("in class c");
    }
}
public class methodoverriding2 {
    public static void main(String[] args) {
        c obj=new c();
        obj.show();
        
        
    }
}
