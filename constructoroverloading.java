class a{
    String name;
    int age;
    a(String ab){String name=ab;}
    a(int bh){int age=bh;}
    a(String g,int h){String name=g; int age=h;}
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}

public class constructoroverloading {
    public static void main(String[] args) {
        a obj1=new a("Alice");
        a obj2=new a(30);
        a obj3=new a("Bob",25);
        obj1.display();
        obj2.display();
        obj3.display();
        
    }
}
