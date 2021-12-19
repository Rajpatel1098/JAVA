package employee;

class Classemployee {

	public class ClassEmployee 

	{
		int emp_id, salary;  
		String name, address, yearofjoining;  
		  
		//Getter and setters for getting and setting properties  
		public int getEmp_id() 
		{  
		    return emp_id;  
		}  
		public void setEmp_id(int emp_id) 
		{  
		    this.emp_id = emp_id;  
		}  
		public int getSalary() 
		{  
		    return salary;  
		}  
		public void setSalary(int salary) 
		{  
		    this.salary = salary;  
		}  
		public String getName() 
		{  
		    return name;  
		}  
		public void setName(String name) 
		{  
		    this.name = name;  
		}  
		public String getAddress() 
		{  
		    return address;  
		}  
		public void setAddress(String address) 
		{  
		    this.address = address;  
		}  
		public String getyearofjoining() 
		{  
		    return yearofjoining;  
		}  
		public void setyearofjoining(String yearofjoining) 
		{  
		    this.yearofjoining = yearofjoining;  
		}  
	}

public String toString() 
{  
    String address;
	String salary;
	String emp_id;
	String name;
	String yearofjoining;
	return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address + ", yearofjoining = " + yearofjoining +"]";
    }  
//Creating main class  

    {  
          
        //Creating object of EmployeeDetails class  
        EmployeeDetails emp = new EmployeeDetails();   
        emp.setEmp_id(101);  
        emp.setName("ROBERT"); 
        emp.setyearofjoining("1994");
        emp.setSalary(15000);  
        emp.setAddress("64C- WallsStreet");
        
        EmployeeDetails emp = new EmployeeDetails();   
        emp.setEmp_id(102);  
        emp.setName("SAM"); 
        emp.setyearofjoining("2000");
        emp.setSalary(10000);  
        emp.setAddress("68D- WallsStreet");
        
        EmployeeDetails emp = new EmployeeDetails();   
        emp.setEmp_id(103);  
        emp.setName("ROBERT"); 
        emp.setyearofjoining("1999");
        emp.setSalary(13500);  
        emp.setAddress("26B- WallsStreet");
          
        //Showing Employee details  
        System.out.println(emp);  
          
        //Getting salary using getter  
        int sal = emp.getSalary();  
        int increment = 0;  
        //Incrementing salary based on condition  
        if ((sal >=1000) && (sal <=1500))  
        {  
            //incrementing salary 2%  
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=1500) && (sal <=20000)){  
            //incrementing salary 5%  
            increment += (sal * 5)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
        }else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp);  
        }         
    }  
}  