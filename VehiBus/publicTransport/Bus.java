package publicTransport;
import transport.Vehicle;

public class Bus extends Vehicle {
    private int licenseNo;

    public Bus(int licenseNo) {
        super(4);
        this.licenseNo = licenseNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public static void main(String[] args){
        
    }
}
