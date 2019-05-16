package typeinfo.pets;

import java.util.*;

/**
 * 设计模式：模板方法模式
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/13 22:32
 */
public abstract class PetCreator {
    private Random random = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){
        int n = random.nextInt(types().size());
        try{
            return types().get(n).newInstance();
        }catch (InstantiationException e){
            throw new RuntimeException(e);
        }catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
