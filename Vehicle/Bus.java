
public class Bus extends Vehicle {
    String title ;
    Bus(String title, String name, int numberOfWheel){
        super(name,numberOfWheel);
        this.title = title;
    }

    void busDetails(){
        System.out.println(title + name+ numberOfWheel);
    }

}
