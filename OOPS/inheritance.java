class Shape{
    String color;

    public void display()
    {
        System.out.println(color);
    }
}

class Triangle1 extends Shape{

}
public class inheritance {
   public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
        t1.color = "red";
        t1.display(); 
   }
  
    
}