class Shape{
    String color;

    public void display(String color)
    {
        this.color = color;
        System.out.println(color);
    }
}

class Triangle1 extends Shape{
    String type;
     Triangle1(String type)
     {
        this.type = type;
        System.out.println(type);
     }
}
//multiple inheritance is not allowed
public class inheritance {
   public static void main(String[] args) {
        Triangle1 t1 = new Triangle1("Equilateral");
        
        t1.color = "red";
        t1.display("blue");
   }
  
    
}