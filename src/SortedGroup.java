import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup<T extends Comparable> {

    private ArrayList<T> _list;

    public SortedGroup(){
        _list = new ArrayList<T>();
    }

    public void add(T item){
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).compareTo(item) > 0){
                _list.add(i, item);
            }
        }
    }

    public int remove(T item) {
        int count = 0;
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).equals(item)){
                _list.remove(i);
                count++;
            }
        }
        return count;
    }

    public Iterator<T> iterator(){
        return _list.iterator();
    }
}