import java.util.ArrayList;
import java.util.List;

public class chri8a00_a_16_9
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(3); numbers.add(5);
        System.out.println(stutter(numbers));
    }

    public static List stutter(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i += 2)
        {
            list.add(i, list.get(i));
        }
        return list;
    }
}
