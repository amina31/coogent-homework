/**
 * 
 */
package sortingalgos;


public class bubblesort {

    public static void bubble(){
    
    	int[] arr1 = {10,27,87,69,21,19};
    	int temp = 0;
    	int n = arr1.length;
	
	   	for(int i = 0;i < n;i++){
	    	for(int j = 1;j < (n - i);j++) {
	    		if(arr1[j - 1] > arr1[j]){
	    			temp = arr1[j - 1];
	    			arr1[j - 1] = arr1[j];
	    			arr1[j] = temp;
	    	}
	         }
              }
	    for(int i=0;i<n;i++){
	    	 System.out.println(arr1[i]);
	    }
    }
	    public static void main(String[] args) {
		bubble();
	    }  
   }
	
