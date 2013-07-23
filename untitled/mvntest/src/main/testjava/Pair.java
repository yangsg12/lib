/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-6-14
 * Time: 下午8:44
 * To change this template use File | Settings | File Templates.
 */
public class Pair<T> {
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
        first = null;
        second = null;
    }

    public T getFirst() {
        return  first;
    }

    public T getSecond() {
        return  second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    private T first;
    private T second;
}