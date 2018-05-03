//To test homework 3 parking project.
//By Akash Kumar, James McCarthy, Keyshawn Wright

public class ParkingDemo
{
  public static void main(String[] args)
  {
    //car object.
    String make = "Tesla",
          model = "S",
          color = "red",
       licenseNum = "4GET OIL";
    int minutesParked = 120;
    ParkedCar car1 = new ParkedCar(make, model, color, licenseNum, minutesParked);
    
    //meter object.
    int minutesPurchased = 90;
    ParkingMeter meter1 = new ParkingMeter(minutesPurchased);
    
    //police object.
    String policeName = "Steve Joblez";
    String badgeNum = "007";
    PoliceOfficer officer1 = new PoliceOfficer(policeName, badgeNum);
    
    //ticket object.
    ParkingTicket ticket1 = officer1.inspectCar(car1, meter1);
    
    //output results.
    if(ticket1 != null)
      System.out.println(ticket1);
    else
      System.out.println("That " + car1.getMake() + " sure looks neat!");
    
    //increase car's minutes.
    car1.setMinutesParked(240);
    
    //another ticket object.
    ParkingTicket ticket2 = officer1.inspectCar(car1, meter1);
    
    //output results again.
    if(ticket2 != null)
      System.out.println(ticket2);
    else
      System.out.println("That " + make + " sure looks neat!");
      
    //another car object.
    String make2 = "BMW",
          model2 = "X6",
          color2 = "Black",
       licenseNum2 = "OOP-0256";
    int minutesParked2 = 30;
    ParkedCar car2 = new ParkedCar(make2, model2, color2, licenseNum2, minutesParked2);
    //another meter object.
    int minutesPurchased2 = 60;
    ParkingMeter meter2 = new ParkingMeter(minutesPurchased2);
    //another ticket object.
    ParkingTicket ticket3 = officer1.inspectCar(car2, meter2);
    
    //output results again.
    if(ticket3 != null)
      System.out.println(ticket3);
    else
      System.out.println("That " + car2.getMake() + " sure looks neat!");
  }
}
