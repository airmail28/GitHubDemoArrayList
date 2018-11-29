import java.util.ArrayList;

public class ArrayListPractice{

	//method 1 to combine lists
	public static ArrayList<Integer> listCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> combolist = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++){
			combolist.add(list1.get(i));
		}
		for(int i = 0; i < list2.size(); i++){
			combolist.add(list2.get(i));
		}
		return combolist;
	}

	//method 2 to print out all values of list
	public static void listPrinter(ArrayList<Integer> list1){
		for(int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + ", ");
		}
		System.out.println();
	}

	//method 3 to remove any duplicates in a list
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> oldlist){
		ArrayList<Integer> newlist = new ArrayList<>();
		int i = 0;
		for(int j = i; j < oldlist.size(); j++){
			if(oldlist.get(i) != oldlist.get(j)){
				oldlist.remove(i);
				i--;
			}
		}
		return newlist;
	}


	public static void main(String[] args){
		ArrayList<Integer> listA = new ArrayList<>();
		for(int i = 5; i < 12; i++){
			listA.add(i);
		}
		ArrayList<Integer> listB = new ArrayList<>();
		for(int i = 3; i < 9; i++){
			listB.add(i);
		}

		ArrayList<Integer> listC = new ArrayList<>();
		listC = listCombine(listA, listB);

		System.out.println(listC);
		listPrinter(listA);

		System.out.println(removeDuplicates(listC));
	}
}