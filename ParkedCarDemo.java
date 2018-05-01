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
       licenNum = "4GET OIL";
    int minutesParked = 120;
    ParkedCar car1 = new ParkedCar();
    
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
      System.out.println("That " + make + " sure looks neat!");
  }
}
