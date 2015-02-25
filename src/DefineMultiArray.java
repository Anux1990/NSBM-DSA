
public class DefineMultiArray {
	String[][] residentialArray = new String [15][7];
	public void printGrid()
	{
		int k = 1;
		 for(int i=0;i<15;i++) {
	            for(int j=0;j<7;j++) {
	            	String r = Integer.toString(k);
	            	residentialArray[i][j]=r;
	                k++;
	            }
	        }

		 for (int i = 0; i < residentialArray.length; i++) 
		 {

			    // Loop and display sub-arrays.
			 String[] sub = residentialArray[i];
			    
			    for (int x = 0; x < sub.length; x++)
			    {
			    	System.out.print(sub[x] + " ");
			    }
			    System.out.println();
		 }
	}
}
