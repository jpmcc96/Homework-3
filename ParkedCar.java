public class ParkedCar
{
     private String make, model, color, licenseNum;
     private int minutesParked;
   
   public ParkedCar(String make, String model, String color, String licenseNum)
   {
      this(make, model, color, licenseNum ,0);
   }
   
   public ParkedCar(String make, String model, String color, String licenseNum, int minutesParked)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.licenseNum = licenseNum;
      this.minutesParked = minutesParked;
   }
   
   public void setMinutesParked(int minutesParked)
   {
      this.minutesParked = minutesParked;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public String getModel()
   {
      return model;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public String getLicenseNum()
   {
      return licenseNum;
   }
   
   public int getMinutesParked()
   {
      return minutesParked;
   }
}
