package Activities;

public class Activity3 {
    public static void main(String[] args){
        // Initializing the variables
        double seconds = 1000000000;
        double EarthSeconds = 31557600;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
//Calculating age in years
        System.out.println("Age on Earth in years is  " +seconds/EarthSeconds);
        System.out.println("Age on Venus age in years is  " +seconds/EarthSeconds/VenusSeconds);
        System.out.println("Age on Mars age in years is  " +seconds/EarthSeconds/MarsSeconds);
        System.out.println("Age on Jupiter age in years is  " +seconds/EarthSeconds/JupiterSeconds);
        System.out.println("Age on Saturn age in years is  " +seconds/EarthSeconds/SaturnSeconds);
        System.out.println("Age on Uranus age in years is  " +seconds/EarthSeconds/UranusSeconds);
        System.out.println("Age on Neptune age in years is  " +seconds/EarthSeconds/NeptuneSeconds);


    }
}
