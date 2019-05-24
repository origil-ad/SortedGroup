import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup<T extends Comparable> {

    private ArrayList<T> _list;

    public SortedGroup() {
        _list = new ArrayList<T>();
    }

    public void add(T item) {
        if (_list.isEmpty()) _list.add(0, item);

        else {
            int index = 0;
            while (index < _list.size() && _list.get(index).compareTo(item) < 0) index++;
            _list.add(index, item);
        }
    }

    public int remove(T item) {
        int count = 0;
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).equals(item)) {
                _list.remove(i);
                count++;
            }
        }
        return count;
    }

    public Iterator<T> iterator() {
        return _list.iterator();
    }
}