import java.util.ArrayList;

public class DynamicFibonacci {
    ArrayList<Integer> table = new ArrayList<Integer>();
    public DynamicFibonacci()
    {
        table.add(0);
        table.add(1);
    }

    public int fibonacci(int n)
    {
        if(n< table.size())
            return table.get(n);

        for (int i = table.size(); i < n+1; i++)
            table.add(table.get(i-1) + table.get(i-2));
        return table.get(n);

    }
}
