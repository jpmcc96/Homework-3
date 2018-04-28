/**
 *Simulates a parking ticket.
 *@author Akash Kumar
 *@version 1.0
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
  public ParkingTicket(String make, String model, String color,
                       String licenseNum, String policeName,
                       String badgeNum, int illegalMinutes)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNum = licenseNum;
    this.policeName = policeName;
    this.badgeNum = badgeNum;
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
