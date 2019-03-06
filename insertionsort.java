//insertion sort algorithm
public class insertionsort{

	//sorting method - static for use without object
	public static void sort(int[] arrList){

		int unsortedValue,key;

		for(int index=1; index<arrList.length; index++){
			
			unsortedValue=index;  //selected value

			//unsortedValue great equal 1 because compare unsortedValue-1
			while(unsortedValue>=1 && arrList[unsortedValue]<arrList[unsortedValue-1]){

				//doing swap because of previous value bigger than selected value
				swap(arrList,unsortedValue-1,unsortedValue);  
				unsortedValue--;  //selected value's new index
			}
		}

	}

	//swap method changes smallest number and selected value
	public static void swap(int[] arrList,int index,int small){

		int temp=arrList[index];
		arrList[index]=arrList[small];
		arrList[small]=temp;
	}

	public static void main(String[] args) {

		int[] list= {8,9,12,4,2,6,2,1,6,8,4,3,15,0,6};

		sort(list);

		//sorted list print process
		for(int i=0;i<list.length;i++){
			System.out.print(" "+list[i]);
		}	
	}
}