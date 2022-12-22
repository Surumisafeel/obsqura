package sample.encapsulation;

public class CarTest {
    public static void main(String args[]){
          //create Car class object
          Car car1 = new Car();

          //set car details.
          car1.setColor("white");
          car1.setSpeed(120);

          //get and print car details.
          System.out.println("Car color: " + car1.getColor());
          System.out.println("Car speed: " + car1.getSpeed());
    }
}
