
public class Testarconditions {
	

	
	public static void main(String[] args) {
	
		float student= 10.0f;
		float room = 4.0f;
		
		if (student > 6.0f){
			System.out.println(student/room);
		}
		else 
			System.out.println("No students");
		
		System.out.println("---");
		
		do {
			System.out.print( student);
			System.out.print(" *2");
			student *= 2;
			System.out.println(student);
		}
		while (student<5.0f);
		
		System.out.println("---");
		
		float[] theVals ={10.0f, 20.0f, 150.0f};
		float sum= 0.0f;
		
		for(float currentVal: theVals)
		sum += currentVal;
		System.out.println(sum+ " "+theVals.length);
		

}
}