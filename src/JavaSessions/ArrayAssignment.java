package JavaSessions;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		//2d array: two dim array:
				//use case: testNG -- data provider + with selenium --> data driven
				//nested for loops:
				//00 01 02 03
				//10 11 12 13
				//20 21 22 23
				
				for(int h = 0; h<=9; h++) {
					for(int g =0; g<=9; g++) {
						System.out.print(h+""+g+" ");
					}
					System.out.println();
				}
				System.out.println("-----");
				
				//2d array:
				int dd[][] = new int[8][8];
				
				for(int h=0; h<dd.length; h++) {
					for(int g=0; g<dd[0].length; g++) {
						System.out.print(h+""+g+" ");
					}
					System.out.println();
				}
				
				
				
			}

		}


