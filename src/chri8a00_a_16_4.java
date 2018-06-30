import java.util.LinkedList;
import java.util.List;

public class chri8a00_a_16_4
{
    public static void main(String[] args)
    {
        List<Integer> nums = new LinkedList<>();
        nums.add(1); nums.add(2); nums.add(5); nums.add(3); nums.add(3); nums.add(6);
        System.out.println(lastIndexOf(32, nums));
    }

    public static int lastIndexOf(int n, List<Integer> nums)
    {
        for (int i = nums.size()-1; i >= 0; i--)
        {
            if (nums.get(i) == n)
            {
                return i+1;
            }
        }
        return - 1;
    }
}
