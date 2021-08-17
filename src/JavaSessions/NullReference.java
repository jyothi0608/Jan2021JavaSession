package JavaSessions;

  public class NullReference {
	  
	  String name;
	  int age;


	public static void main(String[] args) {
		
          NullReference obj = null;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		NullReference obj1 = new NullReference();
//		
//		obj.name = "Tom";
//		obj.age = 25;
//		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
//		
//		obj1 = null;
//		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
		
		new NullReference();
		

	}

}
