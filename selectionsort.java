//selection sort algorithm
public class selectionsort{

	//sorting method - static for use without object
	public static void sort(int[] arrList){

		int smallest; //smallest number's index

		for(int index=0; index<arrList.length; index++){

			smallest=index; //assign selected value smallest
			for(int j=index; j<arrList.length; j++){

				//if find number smaller than arr[smallest], smallest nummber is changed
				if(arrList[smallest]>arrList[j]){
					smallest=j;
				}
			}
			//selected value  and smallest value are sent to swap method
			swap(arrList,index,smallest);
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