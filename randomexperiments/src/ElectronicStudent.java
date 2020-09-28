
public class ElectronicStudent extends Student{
	
   String device;

   ElectronicStudent(int id, String name, String device){
	   super(id,name);
	   this.device=device;
	   System.out.println("after initialization in ElcectronicsStudent ctr");
   }
   
   String getDevice() {
	   return device;
   }
   
   void setDevice(String device) {
	   this.device=device;
   }
}
