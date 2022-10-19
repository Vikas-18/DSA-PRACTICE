public interface interfaces {
    public interface engine
    {
        public void capacity(String cap);
    }

    public interface price {
        int price=100000;
        public int car_price(int price);
    }

    public class Car implements price,engine{
     
        public void capacity(String capacity)
        {
            System.out.println("Capacity  in L:"+ capacity);
        }

     
        public int car_price(int price)
        {
            return price;
        }

        public static void main(String[] args) {
           Car c = new Car();
           c.capacity("10000");
           System.out.println("Price of car is:" + c.car_price(10000000));
        }
    }
   
}
