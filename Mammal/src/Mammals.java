public abstract class Mammals{
    public String name;
    public void sleep(){
        System.out.println("All mammals sleep");
    }
    public void eat(){
        System.out.println("All mammals eat");
    }

}

class cat extends Mammals{
 
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("Cats eat mice");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        super.sleep();
        System.out.println("Cats sleep almost all day");
    }

    public void petName(String name){
        this.name = name;
        System.out.println("pet name is "+ name);
    }
    
}

class Whale extends Mammals{

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Whales eat fish");
    }

    @Override
    public void sleep() {
        // TODO Auto-generate
        System.out.println("Whales sleep 1hr");
    }
    public void petName(String name){
        this.name = name;
        System.out.println("pet name is "+ name);
    }
}