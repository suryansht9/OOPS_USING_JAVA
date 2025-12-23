class a{
    String name;
    int age;

    public void printinfo(){
        System.out.println("name is " + name + " age is " + age);
    }   }
class b extends a{
    int marks;
    public void printmarks(){
        System.out.println("marks are " + marks);
    }
}
public class inheritance {
 public static void main(String[] args) {
    b s1=new b();
    s1.name="suryansh tripathi";
    s1.age=21;
    s1.marks=900;
    System.out.println("[printing the info of first student]");
    s1.printinfo();
    s1.printmarks();
    b s2=new b();
     System.out.println("[printing the info of second student]");
    s2.name="john doe";
    s2.age=22;
    s2.marks=850;
    s2.printinfo();
    s2.printmarks();a
   
 }   
}
