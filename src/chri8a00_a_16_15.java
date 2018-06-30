import java.util.ArrayList;
import java.util.List;

public class chri8a00_a_16_15
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(3); numbers.add(5);
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1); numbers1.add(3); numbers1.add(4);

        System.out.println(notEquals(numbers, numbers1));
    }

    public static boolean notEquals(List<Integer> list1, List<Integer> list2)
    {
        boolean equals = true;

        if (list1.size() != list2.size())
        {
            equals = false;
        }
        else
        {
            for (int i = 0; i < list2.size(); i++)
            {
                if (!list2.get(i).equals(list1.get(i)))
                {
                    equals = false;
                }
            }
        }
        return equals;
    }
}
