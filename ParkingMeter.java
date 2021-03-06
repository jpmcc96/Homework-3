/**
 *Simulates a parking meter.
 *@author Akash Kumar
 *@date 2018/05/04 
 */
public class ParkingMeter
{
  private int minutesPurchased;
  
  /**
   *This default constructor
    initializes minutesPurchased to 60.
   */
  public ParkingMeter()
  {
    this(60);
  }
  
  /**
   *This constructor sets the
    number of minutes purchased.
   *@param minutes the number of minutes
    purchased.
   */
  public ParkingMeter(int minutes)
  {
    if(minutes >= 0)
      minutesPurchased = minutes;
    else
      minutesPurchased = 0;
  }
  
  /**
   *Returns the number of minutes
    purchased.
   *@return the minutes purchased.
   */
  public int getMinutesPurchased()
  {
    return minutesPurchased;
  }
}
