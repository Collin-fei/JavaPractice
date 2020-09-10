package Chapter4;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2020/9/10.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public  Employee(String n ,double s,int year,int month,int day){
        name = n;
        salary = s;
        GregorianCalendar calendar =  new GregorianCalendar(year, month-1,day);
        hireDay = calendar.getTime();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public String getName() {

        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public static void main(String[] args) {
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("xiaoming",1000,2020,1,1);
        staff[1] = new Employee("xiaohong",2000,2020,1,2);
        staff[2] = new Employee("xiaogei",3000,2020,1,3);
        for (Employee e:staff
             ) {
            System.out.println("name = "+e.getName()+" salary = " + e.getSalary()+" hireDay = " + e.getHireDay()
                    );
        }


    }
}
