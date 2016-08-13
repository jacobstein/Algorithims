package algorithims;
import java.util.ArrayList;

public class QuickSort_ArrListStr {
	
	public static void QuickSort(ArrayList<String> list, int start, int end){
		if (start < end){
			int pDex = Partition(list, start, end);
			QuickSort(list, start, pDex-1);
			QuickSort(list, pDex+1, end);
		}
	}
	
	private static int Partition(ArrayList<String> list, int start, int end){
		String pivot = list.get(end);
		int pDex = start;
		for (int i = start; i < list.size()-1; i++){
			if ((list.get(i)).compareTo(pivot) < 0){//lesser than pivot
				Swap(list, i, pDex);
				pDex ++;
			}
		}
		Swap(list, pDex, end);
		return pDex;
	}
	
	private static void Swap(ArrayList<String> list, int a, int b){
		String temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
}
