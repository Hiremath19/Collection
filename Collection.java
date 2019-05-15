import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.concurrent.Callable;

public class Collection {
    public static void main(String args[]) {
        List<String> array = new ArrayList<>();
        Set<String>  hashSetarray = new HashSet<>();
        array.add("11");
        array.add("21");
        array.add("31");
        array.add("41");
        array.add("51");
        array.add("61");

            System.out.println(" ArrayList are : \n" + array);

            System.out.println(" Size of the arraylis are : " + array.size());


            System.out.println(" Get the array of 2nd value : ");
            System.out.println(array.get(2));
            System.out.println();


            System.out.println("Replace value with 31 as mohan");
            array.set(3, "mohan");
            System.out.println("Welcome to sankir technology mohan");
            System.out.println();


            System.out.println(" Remove array value of index 2 ");
            array.remove(2);
            System.out.println(" Size of the updated arraylist: \n" + array);
            System.out.println();


        System.out.println("arrayList shuffeled by ");


            System.out.println(" Sort the arrayList");
            Collections.sort(array);
            System.out.println(" Size of the Sorted ArrayList are : " + array.size());
            System.out.println("Sorted arrayList are: " + array);
            System.out.println();


            hashSetarray.addAll(Arrays.asList("array"));
            System.out.println(hashSetarray);



    }
}
