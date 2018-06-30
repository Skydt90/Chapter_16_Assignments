import java.util.ArrayList;
import java.util.List;

public class chri8a00_a_16_8
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Trøje"); list.add("Bambi"); list.add("Simba"); list.add("Yver");
        System.out.println(swapPairs(list));
    }

    public static List swapPairs(List<String> list)
    {
        for(int i = 0; i <= list.size() -1; i += 2) //Increment by 2, to skip 2 indexes on next run
        {
            String str = list.get(i + 1);           // Temp String for storage
            list.set(i + 1, list.get(i));           // Set value of index 1 to be that of the value from index 0
            list.set(i, str);                       // Set value of index 0 to be that of the value from index 1
        }
        return list;
    }
}
