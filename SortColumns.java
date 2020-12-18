import java.util.ArrayList;
import java.util.List;

public class SortColumns {

    List<Integer> minDeletionSize(String[] A) {

        // return the indices of the columns in argument A, that are not in sorted order
        // return empty list or empty array when all collumns in the argument, A are in
        // sorted order

        List<Integer> results = new ArrayList<>();

        for (int i = 1; i < A.length; i++){
            if(A[i-1].length()!=A[i].length()){
                results.clear();
                results.add(-1);
                return results;
            }
            if (A[i-1].compareTo(A[i]) > 0){
                // results.add(i);
                if (!results.contains(i-1)){
                    results.add(i-1);
                }
                if (!results.contains(i)){
                    results.add(i);
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();

        myList.add(12);
        myList.add(15);
    }


    // The "get function retrieves the data at the index provided, so loop 
    //prints the data in order."
    for (int i = 0; i < myList.size(); i++){
        System.out.println(myList.get(i));
    }
}