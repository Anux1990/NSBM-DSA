
public class DefineMultiArray {
	int[][] residentialArray = new int [3][5];
	public void printGrid()
	{
		/*int k = 1;
		 for(int i=0;i<14;i++) {
	            for(int j=0;j<14;j++) {
	            	residentialArray[i][j]=k;
	                k++;
	            }
	        }*/

		 for (int i = 0; i < residentialArray.length; i++) {

			    // Loop and display sub-arrays.
			    int[] sub = residentialArray[i];
			    for (int x = 0; x < sub.length; x++) {
				System.out.print(sub[x] + " ");
			    }
			    System.out.println();
			}
}
}
