package Chapter5;

import java.util.Random;

/**
 * 继承
 * @author Administrator
 * @date 2020/9/11
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        this.setPosition("经理");
        bonus = 0;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double getSalary(){
        return bonus+super.getSalary();
    }

    public static void main(String[] args) {
        Employee [] staff =new Employee[3];
        Manager manager = new Manager("xiaobai",5000,2020,2,3);
        manager.setBonus(500);

        staff[0] = manager;
        staff[1] = new Employee("xiaohong",2000,2020,1,2);
        staff[2] = new Employee("xiaogei",3000,2020,1,3);

        for (Employee e:staff
             ) {

            System.out.println("name = "+e.getName()+" id = "+ e.getId() + " salary = " + e.getSalary()+" hireDay = " + e.getHireDay()+" position = "+e.getPosition());
        }

    }
}
