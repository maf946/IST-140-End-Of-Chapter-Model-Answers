import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>(5);
        ArrayList<Integer> b = new ArrayList<>(3);

        for (int i = 0; i < 5; i++)
        {
            /* Initialize array list a to some values */
            a.add(i + 3);
        }

        for (int i = 0; i < 3; i++)
        {
            /* Initialize array list b to some values */
            b.add(i + 2);
        }

        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < a.size(); i++)
        {
            c.add(a.get(i));
        }
        for (int i = 0; i < b.size(); i++)
        {
            c.add(b.get(i));
        }
        System.out.println("Result of append of " + a + " and " + b + " is " + c);

    }
}
