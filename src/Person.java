public class Person implements Comparable{

    private String _name;
    private String _id;
    private int _height;

    public Person(String name, String id, int height) {
        _name = name;
        _id = id;
        _height = height;
    }

    public String get_name() {
        return _name;
    }

    public String get_id() {
        return _id;
    }

    public int get_height() {
        return _height;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            return Integer.compare(_height, ((Person) o)._height);
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (_name.equals(p._name) && _id.equals(p._id) && _height==p._height) return true;
            else return false;
        }
        else return false;
    }

    @Override
    public String toString() {
        return String.format("Name:%s, ID:%s, Height:%d", _name,_id, _height);
    }
}