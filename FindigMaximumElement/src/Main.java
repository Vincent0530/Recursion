
public class Main {
	
	
	public static void main(String args[]){
		int[] array = {7,2, 8, 9, -1, 10, 3, 40, -8, -9};
		
		System.out.println(maximum(array));
	}
	
	
	
	
	private static int maximum(int[] list){
		
		int max;
		int[] newList = new int[list.length-1];
		if(list[0] >= list[1]){
			max = list[0];
		}
		else
			max = list[1];
		
		if(list.length == 2)
			return max;
		
		newList[0] = max;
		for(int i=2; i<list.length; i++){
			newList[i-1] = list[i];
		}
		return maximum(newList);
		
	}
}
