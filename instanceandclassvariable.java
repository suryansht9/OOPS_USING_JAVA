class student {
    int rollno;
    static String school="ITS";
    void display(){
        System.out.println("the roll no is "+rollno);
        System.out.println("the school name is "+school);
    }
    
}

public class instanceandclassvariable {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.rollno=101;
        s2.rollno=102;
        s1.display();
        s2.display();}}