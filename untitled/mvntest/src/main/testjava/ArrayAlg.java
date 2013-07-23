/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-6-14
 * Time: 下午8:43
 * To change this template use File | Settings | File Templates.
 */

public class ArrayAlg {
    public   static <T extends Comparable> Pair<T> minMax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<T>(min, max);
    }
}