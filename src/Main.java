import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human human1 = new Human("Alina", "Salamandra", LocalDate.of(1964, 1, 12));
        Human human2 = new Human("Vladimir", "Arapov", LocalDate.of(1954, 3, 30), LocalDate.of(2019, 3, 5));
        Human human3 = new Human("Yaroslav", "Salamandra", LocalDate.of(1989, 3, 24));
        Human human4 = new Human("Vasiliy", "Arapov", LocalDate.of(1995, 12, 30));
        Human human5 = new Human("Vitalia", "Arapova", LocalDate.of(2007, 10, 18));

        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);
        familyTree.addHuman(human5);

        List<Human> children1 = new ArrayList<>(List.of(human3, human4, human5));
        human1.setChildren(children1);

        System.out.println(human1.getChildren());
        System.out.println();

        System.out.println(familyTree.getHumanByFullName("Vasiliy", "Arapov"));

        System.out.println(familyTree.getFamilyTreeInfo());
        System.out.println();

    }
}