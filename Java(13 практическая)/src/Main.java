import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main
{
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> staff = loadStaffFromFile();
        staff.sort((t1,t2) -> {
            if(t1.getName().compareTo(t2.getName()) != 0)
                return t1.getSalary().compareTo(t2.getSalary());
            else
                return t1.getName().compareTo(t2.getName());
            });
        staff.forEach(System.out::println);
    }

    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(fragments[0], Integer.parseInt(fragments[1]), (new SimpleDateFormat(dateFormat)).parse(fragments[2])));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}