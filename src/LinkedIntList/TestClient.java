package LinkedIntList;

public class TestClient
{
    public static void main(String[] args)
    {
        IntList test = new LinkedIntList();
        processList(test);
    }

    public static void processList(IntList list)
    {
        list.add(20);
        list.add(18);
        list.add(27);
        list.add(93);
        list.removeRange(1, 3);
        System.out.println(list);
    }
}
