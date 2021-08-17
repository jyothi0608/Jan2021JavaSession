package JavaSessions;

public class SwitchCaseAssignment {

	public static void main(String[] args) {
		
	   //Using if else
		String browser = "ChroME";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launch chrome");
			}
		else if(browser.equalsIgnoreCase("Internet Explorer")) {
		System.out.println("Launch Internet Explorer");
	      }
	    else if(browser.equalsIgnoreCase("Safari")) {
	    System.out.println("Launch Safari");
			}
		
		//Using switch case
        String browser1 = "ChROmE";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("please pass the correct browser name...");
			break;
		}
		
		
		}

}
