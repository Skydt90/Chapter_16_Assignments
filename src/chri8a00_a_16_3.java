import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class chri8a00_a_16_3
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(5); nums.add(3);
        System.out.println(isSorted(nums));
    }

    public static boolean isSorted(List<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            if (list.get(i + 1) < list.get(i))
            {
                return false;
            }
        }
        return true;
    }
}
