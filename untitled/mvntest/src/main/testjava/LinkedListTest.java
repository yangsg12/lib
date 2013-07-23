import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-6-15
 * Time: 上午11:10
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Bob");
        a.add("Eric");
        System.out.println(a);

        List<String> b = new LinkedList<String>();
        b.add("张三");
        b.add("李四");
        b.add("小明");
        b.add("小王");
        System.out.println(b);

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }

        }

        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}
