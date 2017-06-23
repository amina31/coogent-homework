/**
 * 
 */
package sortingalgos;


public class mergesort {

	  public static void merge(){
		    
	    	int[] arry = {90,65,74,14,32,55,41,80};
	    	
	    
	    	int size1,size2;
		     
	    	if(arry.length % 2 != 0){
	    		size1 = (arry.length/2) + 1;
	    		size2 = (arry.length/2);
	    	}
	    	else{
	    		size1 = arry.length/2;
	    		size2 = size1;
	    	}
	    	 int[] temp1 = new int[size1];
	    	 int[] temp2 = new int[size2];
	    			 
		   	for(int i = 0;i < size1;i++)
		   	{
		   		temp1[i] = arry[i];
		   	}
		   	for(int j = 0;j < size1 - 1;j++)
		   	{
		   		temp2[j] = arry[size1 + j];
		   	}
		   	//sorting the temporary array//
		   	int tmp = 0;
			int index = 0;
			
			while(index < size1){
				
			
				int min = index;
				for(int i = index;i < size1;i++){
					if(temp1[min] >  temp1[i]){
						min = i;
					}
				}
				tmp =temp1[min];
				temp1[min] = temp1[index];
				temp1[index]= tmp;
	            index++;
	            
	            //sorting temporary array second//
	            
	            tmp = 0;
	            index = 0;
			}
	        while(index < size2){
	            	
		        int min = index;
		        for(int i = index;i < size2;i++){
					if(temp2[min] >  temp2[i]){
						min = i;
					}
				}
				tmp =temp2[min];
				temp2[min] = temp2[index];
				temp2[index]= tmp;
				index++;
	        }
	        
	        int i = 0,j = 0,k = 0;
	        while(i < size1 && j < size2) {
	            	
	         	if(temp1[i] <= temp2[j]) {
	           		arry[k] = temp1[i];
	           		i++;
	           	}
	           	else {
	           		arry[k] =temp2[j];
	           		j++;
	           	}
	           	  k++;
	        }
	        while(i < size1) {
	           	arry[k] = temp1[i];
	           	i++;
	           	k++;
	        }
	        while(j < size2) {
	           	arry[k] = temp2[j];
	           	i++;
	           	k++;
	        }
	        System.out.println("merge sort");
		
	        for(int c : arry){
	          	 System.out.println(c + " ");
	        }
	        for(int c : temp1){
	           	System.out.println(c + " ");
	        }
	        for(int c : temp2){
	           	System.out.println(c + " ");
	        }
        	System.out.println();
	}
	  
	            	
	public static void main(String[] args) {
	       merge();

	}

}
