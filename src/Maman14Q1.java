import java.util.Iterator;

public class Maman14Q1 {

    private static final int REDUCING_HEIGHT = 175;

    public static void main(String[] args) {
        Person[] persons = generatePersons();
        SortedGroup<Person> sortedGroup = new SortedGroup<Person>();
        for (Person person : persons) {
            sortedGroup.add(person);
        }

        printCollection(sortedGroup.iterator(), "Collection at first:");
        sortedGroup.add(new Person("Dudu", "654321",174));
        sortedGroup.add(new Person("Niv", "453645", 192));
        printCollection(sortedGroup.iterator(), "Collection after adding dudu and Niv:");


        sortedGroup.remove(new Person("Moshe", "123457", 185));
        printCollection(sortedGroup.iterator(), "Collection after removing Moshe before reduce:");

        var newGroup = SortUtils.reduce(sortedGroup, new Person("", "", REDUCING_HEIGHT));
        printCollection(sortedGroup.iterator(), "Collection after reduce:");
        printCollection(newGroup.iterator(), "reduced group:");

    }

    private static void printCollection(Iterator<Person> iterator, String message) {
        System.out.println(message);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static Person[] generatePersons() {
        return new Person[]{
                new Person("Haim", "123456", 150),
                new Person("Moshe", "123457", 185),
                new Person("Yosef", "545464", 201),
                new Person("Lior", "123454", 191),
                new Person("Ori", "453645", 170)
        };
    }
}