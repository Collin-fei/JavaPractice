package Chapter4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2020/9/10.
 */
public class Employee {
    private String name;
    private double salary;
    private String hireDay;
    private int id;
    private static int nextId = 1;

    public  Employee(String n ,double s,int year,int month,int day){
        name = n;
        salary = s;
        GregorianCalendar calendar =  new GregorianCalendar(year, month-1,day);
        //日期格式化
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        hireDay = formatter.format(calendar.getTime());
    }


    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        ++nextId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {

        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDay() {
        return hireDay;
    }

    public static void main(String[] args) {
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("xiaoming",1000,2020,1,1);
        staff[1] = new Employee("xiaohong",2000,2020,1,2);
        staff[2] = new Employee("xiaogei",3000,2020,1,3);
        for (Employee e:staff
             ) {
            e.setId();
            System.out.println("name = "+e.getName()+" id = "+ e.getId() + " salary = " + e.getSalary()+" hireDay = " + e.getHireDay()
                    );
        }


    }
}
