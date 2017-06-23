/**
 * 
 */
package sortingalgos;


public class selectionsort {

	public static void bubble(){
		int[] arr = {5,7,3,2,57,98,74,61,1};
		int index = 0;
		int n = arr.length;
		int temp = 0;
		
		while(index < n - 1){
			int min = index;
			for(int i = index;i < n;i++){
				if(arr[min] >  arr[i]){
					min = i;
				}
			}
			temp =arr[min];
			arr[min] = arr[index];
			arr[index]= temp;
            index++;
            
            if(index == n)
            break;
            min = arr[index];
		}
		  
	      for(int i = 0;i < n;i++)
	      System.out.println(arr[i]);
      }
     

	public static void main(String[] args) {
		     bubble();
	}
}