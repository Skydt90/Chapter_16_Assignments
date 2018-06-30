import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class chri8a00_a_16_2
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(10); numbers.add(7); numbers.add(21);
        System.out.println(max(numbers));
    }

    public static int max(List<Integer> list)
    {
        int biggest = 0;

        if (list.size() == 0)
        {
            throw new NoSuchElementException("The list is empty");
        }

        for (Integer num : list)
        {
            if (num > biggest)
            {
                biggest = num;
            }
        }
        return biggest;
    }
}
