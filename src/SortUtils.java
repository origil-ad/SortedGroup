public class SortUtils {

    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
        SortedGroup newGrp = new SortedGroup();
        var iterator = sGroup.iterator();
        T current = null;

        while (iterator.hasNext()){
            current = (T)iterator.next();
            if (current.compareTo(x) > 0){
                newGrp.add(current);
            }
        }

        return newGrp;
    }
}