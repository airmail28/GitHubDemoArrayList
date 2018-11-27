import java.util.ArrayList;

public class ArrayListPractice{

	public static ArrayList<Integer> listCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){

		ArrayList<Integer> combolist = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++){
			combolist.add(list1.get(i));
		}
		for(int i = 0; i < list2.size(); i++){
			combolist.add(list1.get(i));
		}
		return combolist;
	}



	public static void main(String[] args){


	}
}