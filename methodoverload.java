class car{
    public void run(String name){{System.out.println("car name is: "+name);}}
    public void run(int speed){{System.out.println("car speed is: "+speed);}}
      
}
public class methodoverload {
    public static void main(String[] args) {
        car j=new car();
        j.run("BMW");
        j.run(200);;
        
    }
    
}
