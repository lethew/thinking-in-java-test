package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/16 23:33
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + ", " + it.nextIndex() + ", "+ it.previousIndex() + "; ");
        }
        System.out.println();

        while (it.hasPrevious()){
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();

        System.out.println(pets);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
/**
 * 输出：
 * Rat, 1, 0; Manx, 2, 1; Cymric, 3, 2; Mutt, 4, 3; Pug, 5, 4; Cymric, 6, 5; Pug, 7, 6; Manx, 8, 7;
 * 7 6 5 4 3 2 1 0
 * [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
 * [Cymric, Rat, EgyptianMau, Hamster, EgyptianMau, Mutt, Mutt, Cymric]
 */
