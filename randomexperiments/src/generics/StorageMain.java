package generics;

public class StorageMain {

	public static void main(String args[]) {
		Integer value=20;
		Storage storage=new Storage();
		storage.setValue(value);
	    System.out.println("added integer value to storage");
		Object fetched=storage.getValue();
		Integer fetchedIntValue=(Integer)fetched;
		
	}
}
