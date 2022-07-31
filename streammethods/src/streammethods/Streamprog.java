package streammethods;
import java.util.*;
import java.util.stream.Collectors;

public class Streamprog {


    public static void main(String[] args) {
        List<Employee> edb = new ArrayList<>();
        edb.add(new Employee(1,"divya","java"));
        edb.add(new Employee(2,"sravys","devops"));
        edb.add(new Employee(3,"sukanya","python"));
        edb.add(new Employee(4,"ramu",".Net"));
       Iterator<Employee> i;
        i = edb.listIterator();
        while (i.hasNext())
        {
            Employee le = i.next();
            System.out.println(le.getEid()+"  "+le.getEname()+" "+le.getDepartment());
        }
        System.out.println("============================================");
        List<Employee> fi = edb.stream().filter(t -> t.getDepartment().equals("java")).collect(Collectors.toList());
        fi.forEach(t -> System.out.println(t.getEname()+"  "+t.getEid()+"  "+t.getDepartment()));
        System.out.println("================================================");
        Spliterator<Employee> a=edb.spliterator();
        a.forEachRemaining(t-> System.out.println(t.getDepartment()+"  "+t.getEid()+"  "+t.getEname()));
        System.out.println("============ ascending order by ename...");
        List<Employee> namelist = edb.stream().sorted(Comparator.comparing(Employee ::getEname,String.CASE_INSENSITIVE_ORDER)).collect(Collectors.toList());
        namelist.forEach(e -> System.out.println(e.getDepartment()+"  "+e.getEid()+"  "+e.getEname()));
        System.out.println("================== ascending order by dept name ");
        List<Employee> deptlist = edb.stream().sorted(Comparator.compare(Employee ::getDeptment,String.CASE_INSENSITIVE_ORDER)).collect(Collectors.toList());
        deptlist.forEach(e -> System.out.println(e.getDepartment()+"  "+e.getEid()+"  "+e.getEname()));
        System.out.println("================================================");
        List<Employee> namelength = edb.stream().sorted(Comparator.comparing(t -> t.getEname().length())).collect(Collectors.toList());
        namelength.forEach(e -> System.out.println(e.getDepartment()+"  "+e.getEid()+"  "+e.getEname()));
        System.out.println("===================change first letter as capital.=======================");
        List<String> change = edb.stream().map(n ->n.getEname().substring(0,1).toUpperCase()+n.getEname().substring(1)).collect(Collectors.toList());
        change.forEach(e -> System.out.println(e));
        List<Employee> ed = edb.stream().distinct().limit(2).collect(Collectors.toList());
        ed.forEach(r-> System.out.println(r.getEname()+" - "+r.getEid()+"-"+r.getDepartment()));
    }
    public static  void printdata(Employee e)
    {
        System.out.println(e.getDepartment()+"  "+e.getEid()+"  "+e.getEname());
    }

}
