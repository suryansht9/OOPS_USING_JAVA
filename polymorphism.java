class student{
    String name;
    int age;
    int marks;
    public void printinfo(String name){System.out.println("name is " + name);}
    public void printinfo(int age){System.out.println("age is " + age);}
    public void printinfo(String name,int age){System.out.println("name of first studnet is " + name + " and her age is " + age);}
}

public class polymorphism {
 public static void main(String[] args) {
    student s1=new student();
    s1.name="suryansh tripathi";
    s1.age=21;
    s1.marks=900;
    s1.printinfo(s1.name);
    s1.printinfo(s1.age);
    s1.printinfo(s1.name,s1.age);
 }   
}
//this is an example of compile time polymorphism or method overloading in java.
//here the method printinfo is overloaded with different parameter types (String, int and String with int).