package Chapter5;

/**
 * 继承
 * @author Administrator
 * @date 2020/9/11
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
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
        Manager manager = new Manager("xiaobai",5000,2020,2,3);
        manager.setBonus(500);
        System.out.println("name = "+manager.getName()+" id = "+ manager.getId() + " salary = " + manager.getSalary()+" hireDay = " + manager.getHireDay()+" bonus=" + manager.getBonus());
    }
}
