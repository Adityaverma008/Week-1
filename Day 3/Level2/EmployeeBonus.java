import java.util.Scanner;
class Employee{ 
    double salary; 
    double year; 

Employee( double salary,
double year){
    this.salary=salary; 
    this.year=year;
}
}
    

class EmployeeBonus{ 
    public static void main(String[] args) { 
        Employee e []=new Employee[10]; 
        Scanner sc=new Scanner(System.in);
        double totalBonus=0.0; 
        double totalnewSalary=0.0; 
        double oldSalary=0.0;
        for (int i=0;i<10;i++){  
             double d=sc.nextDouble(); 
             double y=sc.nextDouble();
            e[i]=new Employee(d,y);

        }
        double  [] bonus  = new double[10];
        for (int i = 0; i < 10; i++) {
            if(e[i].year>=5){
                bonus[i] = 0.05*e[i].salary;
            }
            else{
                bonus[i] = 0.02*e[i].salary;   
            } 
            totalBonus+=bonus[i];
        }
        double newSalary[] = new double[10];
        for (int i = 0; i < 10; i++) {
            newSalary[i] = e[i].salary + bonus[i]; 
            totalnewSalary+=newSalary[i]; 
            oldSalary+=e[i].salary;
        } 
        System.out.println("Total old Salary "+oldSalary);
        System.out.println("Total Bonus of the "+totalBonus);
        System.out.println("Total new Salary"+newSalary);
        sc.close();
        

        
            


        
    }
}

