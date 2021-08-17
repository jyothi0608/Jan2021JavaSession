package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.gynecServices();
		
		fh.medicalInsurance();
		fh.pathalogyServices();
				
		System.out.println(USMedical.min_fee);
		
		USMedical.billing();
		fh.taxCollection();
		fh.RD();
		
		//top casting: child class object is referred by parent interface ref variable
		USMedical us = new FortisHospital();
		
		us.orthoServices();
		us.emergencyServices();
		us.neuroServices();
		us.radioServices();

	}

}
