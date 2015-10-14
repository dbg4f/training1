import com.sun.corba.se.spi.ior.ObjectKey;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by Tanja on 10/14/2015.
 */
public class ObjectFactory<T> {

    //private static ObjectFactory instance = new ObjectFactory();


    public T createObject(Class<T> type) throws IllegalAccessException, InstantiationException {

        if (type.isInterface()) {

            //type =

        }

        T instance = type.newInstance();

        for (Field f : type.getDeclaredFields()) {

            InjectRandomInt injectRandomInt = f.getAnnotation(InjectRandomInt.class);

            System.out.println("injectRandomInt = " + injectRandomInt);

            if (injectRandomInt != null) {

                f.setAccessible(true);

                f.set(instance, createRandomBoundedInt(injectRandomInt));

            }

        }


        return instance;

    }

    private int createRandomBoundedInt(InjectRandomInt injectRandomInt) {

        int range = injectRandomInt.max() - injectRandomInt.min();

        int random = new Random(System.currentTimeMillis()).nextInt() % range;

        random = Math.abs(random);

        int value = injectRandomInt.min() + random;

        return value;
    }


}
