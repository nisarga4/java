public class BooleanExample {
    public static void main(String[] args) {
        boolean loggedIn = true, electricCar = false, hasLicense = true, isAdmin = false, isWeekend = true;
        System.out.println(loggedIn + " " + electricCar + " " + hasLicense + " " + isAdmin + " " + isWeekend);
        
        loggedIn = false; electricCar = true; hasLicense = false; isAdmin = true; isWeekend = false;
        System.out.println(loggedIn + " " + electricCar + " " + hasLicense + " " + isAdmin + " " + isWeekend);
    }
}