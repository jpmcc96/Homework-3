# PoliceOfficer.java
public class PoliceOfficer
{
   private String name;
   private String badgeNum;
    
   public PoliceOfficer(String name, String badgeNum)
   {
      this.name = name;
      this.badgeNum = badgeNum;
   }
   
   public inspectCar(ParkedCar, status)
   {
      this.ParkedCar = ParkedCar;
      this.status = status;
      
      if(this.status = true)
      {
         parkingTicket = new ParkingTicket();
      }
      
      else
      {
         System.out.println("Car is not parked illegally"); 
      }
      
   }
   
   private boolean hasTimeExpired(int illegal)
   {
      
      if(illegal != null)
      {
         status = true;      
      }
      
      else
      {
         status = false;
      }
      
      return status;
   }
   
   public int getIllegalMinutes(car, meter)
   {
      int illegal = null;
      
      if(minutesPurchased < ParkingMeter)
      {
         illegal = (minutesPurchased - ParkingMeter);   
      }
      else
      {
         illegal = null;
      }
      return illegal;
   }
   
   public String getOfficerName(name)
   {
      officerName = name;
      return officerName;
   }
   
   public String getBadgeNum(badgeNum)
   {
      this.badgeNum = badgeNum;
      return badgeNum;
   }
   
}
