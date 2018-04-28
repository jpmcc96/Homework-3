/**
 *Simulates a parking ticket.
 *@author Akash Kumar
 *@version 1.2.0
 *@date 2018/04/28
 */
public class ParkingTicket
{
  private int fine;
  
  /**
   *This constructor is used to initialize the field.
   */
  public ParkingTicket(int illegalMinutes)
  {
    fine = getFineAmount(illegalMinutes);
  }
  
  /**
   *This helper method calculates the fine amount.
   *@param illegalMinutes the number of minutes
    the car was parked illegally.
   *@return the amount of the fine. 
   */
  private int getFineAmount(int illegalMinutes)
  {
    /* 
      $25 for the first hour and
      $10 for every additional hour.
     */
    if(illegalMinutes > 0)
      return ((illegalMinutes-60)/60)*10 + 25;
    else
      return 0;
  }
  
  /**
   *Gets the contents of the ticket.
   *@return the report.
   */
  public String getReport(ParkedCar car, PoliceOfficer police)
  {
    String report = "Parking Ticket" + "\n" +
                    "--------------" + "\n" +
                    "Make: " + car.getMake() + "\n" +
                    "Model: " + car.getModel() + "\n" +
                    "Color: " + car.getColor() + "\n" +
                    "License number: " + car.getLicenseNum() + "\n\n" +
                    "Police Officer: " + police.getOfficerName() + "\n" +
                    "Badge number: " + police.getBadgeNum() + "\n\n" +
                    "Fine: " + fine;
    
    return report;
  }
  
  /**
   *Converts contents of the ticket to a String.
   *@return report
   */
  public String toString(ParkedCar car, PoliceOfficer police)
  {
    return getReport(car, police);
  }
}
