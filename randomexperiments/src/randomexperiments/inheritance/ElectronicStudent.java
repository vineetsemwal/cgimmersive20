package randomexperiments.inheritance;

public class ElectronicStudent extends Student{
	
   private String device;

   public ElectronicStudent(int id, String name, int age, String device){
	   super(id,name,age);
	   this.device=device;

   }
   
   public String getDevice() {
	   return device;
   }
   
   public void setDevice(String device) {
	   this.device=device;
   }
}
