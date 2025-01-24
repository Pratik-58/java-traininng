import java.util.*;

public class employee
{

    int id;
    String name;
    int salary;
    department department;

        // Constructor
        public employee (int id, String name, int salary, department department) 
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getSalary() {
            return salary;
        }
    
        public void setSalary(int salary) {
            this.salary = salary;
        }
    
        public department getDepartment() {
            return department;
        }
    
        public void setDepartment(department department) {
            this.department = department;
        }
    }
    
class department
{
    int dept_id;
    int emp_id;
    String dept_name;

    public department(int dept, int emp_id, String dept_name)
    {
        this.dept_id = dept_id;
        this.emp_id = emp_id;
        this.dept_name = dept_name;
    }

    public int getDept_id() {
        return dept_id;
    }   

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }   

    public String getDept_name()
    {
        return dept_name;
    }
    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }   
}

class main
{
    public static void main(String[] args)
    {
        List<employee> list = new ArrayList<employee>();
        list.add(new employee(1, "John", 1000, new department(1, 1, "HR")));
        
        List<employee> list1 = new ArrayList<employee>();
        list1.add(new employee(2, "Smith", 2000, new department(2, 2, "IT")));

        List<employee> list2 = new ArrayList<employee>();
        list2.add(new employee(3, "Doe", 3000, new department(3, 3, "Finance")));
    }
}