


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-6-14
 * Time: 下午7:21
 * To change this template use File | Settings | File Templates.
 */
public class PairTest2 {
    public static void main(String[] args) {
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
                new GregorianCalendar(2000, Calendar.DECEMBER, 10),
                new GregorianCalendar(1906, Calendar.DECEMBER, 3),
                new GregorianCalendar(1906, Calendar.JUNE, 22),
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minMax(birthdays);
        System.out.println("min = " + mm.getFirst().getTime());
        System.out.println("max = " + mm.getSecond().getTime());

    }


}
