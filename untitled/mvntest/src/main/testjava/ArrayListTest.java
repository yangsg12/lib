import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-6-8
 * Time: 下午8:58
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<Employee>();
        staff.add(new Employee("Carl Cracker", 7500, 1987, 12, 12));
        staff.add(new Employee("Harry Hacker", 5000, 1989, 12, 1));
        staff.add(new Employee("Tony Tester", 6500, 1987, 2, 12));
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay= " + e.getHireDay());
        System.out.println("before raise");
        for (Employee e : staff)
            e.raiseSalary(1000);
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay= " + e.getHireDay());

    }

   static class Employee {
        Employee(String name, double salary, int year, int month, int day) {
            this.name = name;
            this.salary = salary;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            this.hireDay = calendar.getTime();
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        double getSalary() {
            return salary;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        Date getHireDay() {
            return hireDay;
        }

        void setHireDay(Date hireDay) {
            this.hireDay = hireDay;
        }

        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100;
            salary += raise;
        }


        private String name;
        private double salary;
        private Date hireDay;

    }
}

