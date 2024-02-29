class Vehicle{
    private String owner;
    private int wheels;
    private String regNo;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    
}

class Car extends Vehicle{

    @Override
    public void setWheels(int wheels) {
        // TODO Auto-generated method stub
        super.setWheels(wheels);
    }

    @Override
    public String getOwner() {
        // TODO Auto-generated method stub
        return super.getOwner();
    }

    @Override
    public String getRegNo() {
        // TODO Auto-generated method stub
        return super.getRegNo();
    }

    @Override
    public int getWheels() {
        // TODO Auto-generated method stub
        return super.getWheels();
    }

}

class Lorry extends Vehicle{
    


    @Override
    public void setWheels(int wheels) {
        // TODO Auto-generated method stub
        super.setWheels(wheels);
    }

    @Override
    public String getOwner() {
        // TODO Auto-generated method stub
        return super.getOwner();
    }

    @Override
    public String getRegNo() {
        // TODO Auto-generated method stub
        return super.getRegNo();
    }

    @Override
    public int getWheels() {
        // TODO Auto-generated method stub
        return super.getWheels();
    }

}

class Bicycle extends Vehicle{
    public Bicycle() {
        super(); 
      }
      @Override
      public void setWheels(int wheels) {
        super.setWheels(wheels);
      }
    
      @Override  
      public int getWheels() {
        return super.getWheels();
      }

    
}

