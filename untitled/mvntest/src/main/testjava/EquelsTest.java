import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-6-8
 * Time: 下午7:54
 * To change this template use File | Settings | File Templates.
 */
public class EquelsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 7500, 1987, 12, 25);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 7500, 1989, 10, 1);
        Employee bob = new Employee("bob stone", 8500, 1986, 11, 11);
        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 10, 10);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 10, 10);
        boss.setBonus(2000);
        System.out.println("boss.toString() " + boss);
        System.out.println("carl.equals(boss) " + carl.equals(boss));
        System.out.println("alice1.hasCode(): " + alice1.hashCode());
        System.out.println("alice3.hasCode(): " + alice3.hashCode());
        System.out.println("bob.hasCode(): " + bob.hashCode());
        System.out.println("carl.hasCode(): " + carl.hashCode());


    }

    static class Employee {
        Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            hireDay = calendar.getTime();

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

        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100;
            salary += raise;
        }

        public boolean equals(Object otherObject) {
            if (otherObject == null) return false;
            if (getClass() != otherObject.getClass()) return false;
            Employee other = (Employee) otherObject;
            return name.equals(other.name) && salary == other.salary && hireDay.equals(other.getHireDay());
        }

        public int hashCode() {
            return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
        }

        public String toString() {
            return getClass().getName() + "[name = " + name + ", salary = " + salary + ", hireDay = " + hireDay + "]";
        }

        void setName(String name) {
            this.name = name;
        }

        private String name;
        private double salary;
        private Date hireDay;
    }

    static class Manager extends Employee {
        Manager(String n, double s, int year, int month, int day) {
            super(n, s, year, month, day);
            bonus = 0;
        }

        double getBonus() {
            return bonus;
        }

        void setBonus(double bonus) {
            this.bonus = bonus;
        }

        private double bonus;

        @Override
        public double getSalary() {
            return super.getSalary() + bonus;    //To change body of overridden methods use File | Settings | File Templates.
        }


        @Override
        public boolean equals(Object o) {
            if (!super.equals(o)) return false;

            Manager manager = (Manager) o;


            return bonus == ((Manager) o).getBonus();
        }

        @Override
        public int hashCode() {
            return super.hashCode() + 17 * new Double(bonus).hashCode();
        }

        @Override
        public String toString() {
            return super.toString() + "[bonus = " + bonus + "]";    //To change body of overridden methods use File | Settings | File Templates.
        }
    }
}
