import java.util.Iterator;

public class Maman14Q1 {

    public static void main(String[] args) {
        Person[] persons = generatePersons();
        SortedGroup<Person> sortedGroup = new SortedGroup<Person>();
        for (Person person : persons) {
            sortedGroup.add(person);
        }
        var iterator = sortedGroup.iterator();

        printCollection(iterator, "Collection at first:");
        sortedGroup.add(new Person("Dudu", "654321",174));
        sortedGroup.add(new Person("Ori", "453645", 192));
        printCollection(iterator, "Collection after adding dudu and ori:");


        sortedGroup.remove(new Person("Moshe", "123457", 185));
        printCollection(iterator, "Collection after removing ori before reduce:");

        SortUtils.reduce(sortedGroup, new Person("", "", 174));
        printCollection(iterator, "Collection after reduce:");
    }

    private static void printCollection(Iterator<Person> iterator, String message) {
        System.out.println(message);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static Person[] generatePersons() {
        return new Person[]{
                new Person("Haim", "123456", 150),
                new Person("Moshe", "123457", 185),
                new Person("Yosef", "545464", 201),
                new Person("Lior", "123454", 191),
                new Person("Ori", "453645", 170)
//                new Person("Niv", "456319",177 )
        };
    }
}