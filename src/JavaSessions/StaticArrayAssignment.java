package JavaSessions;

public class StaticArrayAssignment {

	public static void main(String[] args) {
		
		Object ob[] = new Object[7];
		ob[0] = "Peter";
		ob[1] = 20;
		ob[2] = "6/8/1991";
		ob[3] = 'm';
		ob[4] = "cobras";
		ob[5] =  12.33;
		ob[6] = "isActive";
		
		for(Object e : ob) {
			System.out.println(e);
		}
		
		for(int n=0; n<ob.length; n++) {
			System.out.println(ob[n]);
		}

	}

}
