//bubble sort algorithm
public class bubblesort{

	//sorting method - static for use without object
	public static void sort(int[] arrList){

		for(int i=0;i<=arrList.length;i++){
			for(int j=0;j<arrList.length-1;j++){

				//swap process
				if(arrList[j]>arrList[j+1]){
					int swap=arrList[j];
					arrList[j]=arrList[j+1];
					arrList[j+1]=swap;
				}
			}
		}
	}

	//main method
	public static void main(String[] args) {
		
		int[] list= {8,9,12,4,2,6,2,1,6,8,4,3,15,0,6};

		sort(list);

		//sorted list print process
		for(int i=0;i<list.length;i++){
			System.out.print(" "+list[i]);
		}
	}
}