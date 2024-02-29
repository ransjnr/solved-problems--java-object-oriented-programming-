
public class VehicleTest {

    public static void main(String[] args) {
      
      Car lambo = new Car();
      Lorry sprinter = new Lorry();
    //   Bicycle ambike = new Bicycle();
  
      lambo.setWheels(4);
      sprinter.setWheels(6);
    //   ambike.setWheels(2);
  
      System.out.println("Car has " + lambo.getWheels() + " wheels");
      System.out.println("Lorry has " + sprinter.getWheels() + " wheels");
    //   System.out.println("Bicycle has " + ambike.getWheels() + " wheels");
  
    }
}