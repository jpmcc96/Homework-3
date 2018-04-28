/**
 *Simulates a parking ticket.
 *@author Akash Kumar
 *@version 1.1.1
 *@date 2018/04/27
 */
public class ParkingTicket
{
  private String make,
                 model,
                 color,
                 licenseNum,
                 policeName,
                 badgeNum;
  private int fine;
  
  /**
   *This constructor is used to initialize the fields.
   */
  public ParkingTicket(ParkedCar car, PoliceOfficer police,
                       int illegalMinutes)
  {
    this.make = car.getMake();
    this.model = car.getModel();
    this.color = car.getColor();
    this.licenseNum = car.getLicenseNum();
    this.policeName = police.getPoliceName();
    this.badgeNum = police.getBadgeNum();
    fine = getFineAmount(illegalMinutes);
  }
  
  /**
   *Calculates the fine amount.
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
    return ((illegalMinutes-60)/60)*10 + 25;
  }
  
  /**
   *Outputs contents of the ticket.
   */
  public void getReport()
  {
    String report = "Parking Ticket" + "\n" +
                    "--------------" + "\n" +
                    "Make: " + make + "\n" +
                    "Model: " + model + "\n" +
                    "Color: " + color + "\n\n" +
                    "Police Officer: " + policeName + "\n" +
                    "Badge number: " + badgeNum + "\n\n" +
                    "Fine: " + fine;
    
    System.out.println(report);
  }
}
