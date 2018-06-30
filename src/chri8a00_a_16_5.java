import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class chri8a00_a_16_5
{
    public static void main(String[] args)
    {
        List<Integer> nums = new LinkedList<>();
        nums.add(8); nums.add(7); nums.add(1); nums.add(3); nums.add(9); nums.add(6);
        System.out.println("Number of dublicates in list: " + countDublicates(nums));
    }

    public static int countDublicates(List<Integer> list)
    {
        int count;
        Set<Integer> dublicates = new TreeSet<>(list);
        return count = list.size() - dublicates.size() ;
    }
}
