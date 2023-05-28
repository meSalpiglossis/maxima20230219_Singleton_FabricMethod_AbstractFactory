package utils;

import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

public class RandomSubTypeGenerator {
    public static <T> T getRandomSubType(Class<T> superClass) {
        try {
            Reflections reflections = new Reflections(superClass);
            Set<Class<? extends T>> subTypes = reflections.getSubTypesOf(superClass);
            Class<? extends T>[] subTypesArray = subTypes.toArray(new Class[subTypes.size()]);
            if(subTypesArray.length == 0) {
                return null;
            }
            Random random = new Random();
            int index = random.nextInt(subTypesArray.length);
            Class<? extends T> randomSubType = subTypesArray[index];
            return randomSubType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
