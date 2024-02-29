class Agent{

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    
}

abstract class Modeller extends Agent{
    private String model;

    abstract String getModel();

    abstract void setModel(String model);
}


class NetworkModeller extends Modeller implements Control{

    @Override
    String getModel() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    void setModel(String model) {
        // TODO Auto-generated method stub
        
    }
    
}

interface Control{
    default void enable(){};

    default void disable(){};
}
