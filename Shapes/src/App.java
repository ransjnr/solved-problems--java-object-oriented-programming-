class Shapes {

    private double area;
  
    public double getArea(){
      return area;
    }
  
    public void setArea(double area){
      this.area = area;
    }
  
  }
  
  abstract class Quadrilateral extends Shapes {
  
    private double length;
  
    abstract double getLength();
  
    abstract void setLength(double length);


  
  }
  
  class Square extends Quadrilateral implements Polygon {
  
    private double length;

    @Override
    public double getArea() {
      return getLength() * getLength(); 
    }
  
    @Override
    void setLength(double length){
      this.length = length;
    }
  
    @Override
    double getLength(){
      return length;
    }
  
  }
  
  interface Polygon {
    
    double getArea();
  
  }
  
  
  public class App {
  
    public static void main(String[] args) {
  
      Square square = new Square();
      square.setLength(5);
      
      double area = square.getArea();
      System.out.println(area);
  
    }
  
  }