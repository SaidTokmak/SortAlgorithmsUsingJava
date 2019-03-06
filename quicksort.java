//quick sort algorithm
public class quicksort{

	//sorting method - static for use without object
	public static void quickSort(int[] arrList,int low,int high){

		if(low<high){  //if low great equal high, array already sorted 

			//selected pivot 
			int pivot=partition(arrList,low,high);

			//recursive method- left side of pivot and right side of pivot
			quickSort(arrList,low,pivot-1);
			quickSort(arrList,pivot+1,high);
		}
	}

	//partition method - select pivot and lower to the left side else right side  
	public static int partition(int[] arrList,int low,int high){

		int pivot=arrList[low];  //selected pivot lowest
		int leftside=low+1;  //selected next number

		for(int i=leftside; i<=high; i++){

			if(arrList[i]<pivot){
				swap(arrList,i,leftside);  //change smaller number to left
				leftside++;  
			}
		}

		//last change leftside and pivot - low is index of pivot
		swap(arrList,leftside-1,low);

		return(leftside-1);  //return pivot index
	}

	//swap method changes smallest number and selected value
	public static void swap(int[] arrList,int index,int small){

		int temp=arrList[index];
		arrList[index]=arrList[small];
		arrList[small]=temp;
	}

	public static void main(String[] args) {
		
		int[] list= {8,9,12,4,2,6,2,1,6,8,4,3,15,0,6};

		quickSort(list,0,14);

		//sorted list print process
		for(int i=0;i<list.length;i++){
			System.out.print(" "+list[i]);
		}	
	}	
}