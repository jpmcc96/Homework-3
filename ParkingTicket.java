/**
 *Simulates a parking ticket.
 *@author Akash Kumar
 *@date 2018/05/04
 */
public class ParkingTicket
{
  private String make,
                 model,
                 color,
                 licenseNum,
                 officerName,
                 badgeNum;
  private int illegalMinutes,
              fine;
  
  /**
   *This constructor is used to initialize the field.
   */
  public ParkingTicket(ParkedCar car, PoliceOfficer police,
                       int illegalMinutes)
  {
    make = car.getMake();
    model = car.getModel();
    color = car.getColor();
    licenseNum = car.getLicenseNum();
    officerName = police.getOfficerName();
    badgeNum = police.getBadgeNum();
    this.illegalMinutes = illegalMinutes;
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
  public String getReport()
  {
    String report = "Parking Ticket" + "\n" +
                    "--------------" + "\n" +
                    "Make: " + make + "\n" +
                    "Model: " + model + "\n" +
                    "Color: " + color + "\n" +
                    "License number: " + licenseNum + "\n\n" +
                    "Police Officer: " + officerName + "\n" +
                    "Badge number: " + badgeNum + "\n\n" +
                    "Minutes parked illegally: " + illegalMinutes + "\n" +
                    "Fine: $" + fine + "\n";
    
    return report;
  }
  
  /**
   *Converts contents of the ticket to a String.
   *@return report
   */
  public String toString()
  {
    return getReport();
  }
}
