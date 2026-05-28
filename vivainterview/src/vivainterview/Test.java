package vivainterview;

public class Test {

	public static void main(String[] args) {
		EncapsulationTest enTest = new EncapsulationTest();
		enTest.setAge(30);
		enTest.setName("Rajalaxmi");
		
		
        System.out.println("Age :  " + enTest.getAge());
        System.out.println("Name :  " + enTest.getName());
	}

}
