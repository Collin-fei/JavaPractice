package Chapter5;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Administrator
 * @date 2020/9/10
 */
public class Employee {
    private String name;
    private double salary;
    private String hireDay;
    private int id;
    private static int nextId = 1;
    private String position;

    public Employee(String n , double s, int year, int month, int day){
        name = n;
        salary = s;
        GregorianCalendar calendar =  new GregorianCalendar(year, month-1,day);
        //日期格式化
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        hireDay = formatter.format(calendar.getTime());
        position = "员工";
    }


    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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





}
