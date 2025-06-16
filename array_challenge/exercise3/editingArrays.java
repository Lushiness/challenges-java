//SORT,REVERSE and Clear elements in a string Array

package array_challenge.exercise3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class editingArrays {
    public static void main (String[]args){
        //Initial array of pallet Ids
        String[] pallets = {"B14" , "A11" , "B12" , "A13"};
        //sort the array in acsending order
        System.out.println("Sorted....");
        Arrays.sort(pallets);
        for (String pallet : pallets){
            System.out.println("--" + pallet);
        }

        //Reverse the sorted array
        System.out.println("/nReversed ....");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);// reverse the list
        for (String pallet : palletList){
            System.out.println("--" + pallet);
        }

    }
    
}
