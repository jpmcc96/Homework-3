/**
  *This class simulates a police officer.
  *@author James McCarthy
  *@date 2018/05/03
*/
public class PoliceOfficer
{
   private String name;
   private String badgeNum;
    
   public PoliceOfficer(String name, String badgeNum)
   {
      this.name = name;
      this.badgeNum = badgeNum;
   }
   
   public ParkingTicket inspectCar(ParkedCar car, ParkingMeter meter)
   {
      boolean status = hasTimeExpired(car, meter);
      
      if(status == true)
      {
         int illegalMinutes = getIllegalMinutes(car, meter);
         return new ParkingTicket(car, this, illegalMinutes);
      }
      else
      {
         return null; 
      }
      
   }
   
   private boolean hasTimeExpired(ParkedCar car, ParkingMeter meter)
   {
      boolean status = false;
      
      if(car.getMinutesParked() > meter.getMinutesPurchased())
      {
         status = true;      
      }
      
      return status;
   }
   
   public int getIllegalMinutes(ParkedCar car, ParkingMeter meter)
   {
      return car.getMinutesParked() - meter.getMinutesPurchased();
   }
   
   public String getOfficerName()
   {
      return name;
   }
   
   public String getBadgeNum()
   {
      return badgeNum;
   }
   
}
