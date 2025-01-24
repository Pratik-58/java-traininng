import java.util.*;

class Employee
{
    int id;
    String name;
    Department department;
    double salary;
    Employee(int id, String name, Department department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double sal)
    {
        this.salary = sal;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setDepartment(Department department)
    {
        this.department = department;
    }
    public Department getDepartment()
    {
        return department;
    }
    public void getall()
    {
        System.out.println();
    }
    @Override
    public String toString()
    {
        return "Employee{id=" + id + ", name='" + name + '\'' + ", department=" + department + ", salary=" + salary + '}';
    }

}

class Department
{
    int dept_id;
    int emp_id;
    String dept_name;

    Department(int did, int eid, String dname)
    {
        dept_id = did;
        emp_id = eid;
        dept_name = dname;
    }
    public void setDept_id(int id)
    {
        this.dept_id = id;
    }
    public int getDept_id()
    {
        return dept_id;
    }
    public void setEmp_id(int id)
    {
        this.emp_id = id;
    }
    public int getEmp_id()
    {
        return emp_id;
    }
    public void setDept_name(String dname)
    {
        this.dept_name = dname;
    }
    public String getDept_name()
    {
        return dept_name;
    }
    @Override
    public String toString()
    {
        return "Department{dept_id=" + dept_id + ", dept_name='" + dept_name + '\'' + '}';
    }
}



public class Stapi
{
    public static void main(String[] args)
    {

        List<Employee> emplist = new ArrayList();

        emplist.add (new Employee(101, "Pratap", new Department(1, 101, "QA"), 10000));
        emplist.add (new Employee(102, "Anshul", new Department(2, 102, "Comp"), 20000));
        emplist.add (new Employee(103, "Partth", new Department(1, 103, "QA"), 10500));
        emplist.add (new Employee(104, "Aniket", new Department(2, 104, "Comp"), 10990));

        // System.out.println(emplist.getName());
        // Optional<Employee> op = emplist.stream().filter(e -> e.getName().equals("Pratap")).findAny();
        // if(op.isPresent()) System.out.println(op.get());
        // else System.out.println("Empty List");
        
        // emplist.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        
        Optional <Employee> e1 = emplist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findAny();
        System.out.println(e1);
    }
}