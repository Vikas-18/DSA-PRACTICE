class Shape{
    String color;

    public void display()
    {
        System.out.println(color);
    }
}

class Triangle extends Shape{

}
public class inheritance {
   public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.display(); 
   }
  
    
}