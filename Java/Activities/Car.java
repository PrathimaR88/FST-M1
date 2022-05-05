package Activities;
//Creating Class Car
public class Car {


        //Declaring the variables
        String color;
        String Transmission;
        int make;
        int tyres;
        int door;
        //Creating Constructor
        Car(){
            tyres = 4;
            door = 4;
        }
        //Creating class methods
        public void displayCharacteristics(){
            System.out.println("Car color   " + color);
            System.out.println("Car Transmission  " + Transmission);
            System.out.println("Car Make  " + make);
            System.out.println("Car tyres  " + tyres);
            System.out.println("Car doors  " + door);
        }
        //Creating method Accelerate
        public void accelerate(){
            System.out.println("Car is moving forward");
        }
        //Creating method Break
        public void brake(){
            System.out.println("Car has stopped");
        }
    }

