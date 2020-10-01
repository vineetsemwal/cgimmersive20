package generics;

public class StorageMain {

	public static void main(String args[]) {
		Integer value = 20;
		Storage<Integer> storage = new Storage<Integer>();
		storage.setValue(value);
		System.out.println("added integer value to storage");
		Integer fetched = storage.getValue();

	}
}
