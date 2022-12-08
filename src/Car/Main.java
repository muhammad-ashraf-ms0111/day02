package Car;

//import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("S12345", "red", "Dodge"); 
        Car myOtherCar = new TurboChargedCar("T12345");

        // myCar.setColour("red");
        // myCar.setMake("Honda");
        // myCar.setRegistration("S12345A");
        // myCar.setRegistrationDate(new Date());

        myCar.horn();
        System.out.println(myCar);
        // System.out.printf("color: %s, make: %s, registration: %s\n"
        //     , myCar.getColour(), myCar.getMake(), myCar.getRegistration());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.printf("acceleration: %d\n", myCar.getAcceleration());

        if (myOtherCar instanceof TurboChargedCar) {
            // Test whether it is part of the TurbochargedCar
            // Cast into a TurboChargedCar type
            TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
            turbo.setTurbo(true);
        }


    }
    
}