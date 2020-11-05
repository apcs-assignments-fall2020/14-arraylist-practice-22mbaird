import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for(int i=0;i<list.size(); i++){
            if (list.get(i)%2!=0){
                c+=1;
            }

        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        boolean dupbol = true;
        for(int i=0;i<list1.size(); i++){
            for(int x=0;x<list2.size(); x++){
                dupbol = list1.get(i)==list2.get(x);
                if (dupbol==false){
                    break;
                }                    
                    
            }
                
        }
    return dupbol;
        
    }
        
    

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> listnew = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++){
            listnew.set(i, arr[i]);
        }
        return listnew;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(convertToArrayList(arr));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list2.add(2);
        list2.add(3);
        System.out.println(checkDuplicates(list1, list2));
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(countOdd(list));




    }
}
