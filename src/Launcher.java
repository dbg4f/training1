/**
 * Created by Tanja on 10/14/2015.
 */
public class Launcher {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        ConfigurableEntity entity = new ObjectFactory<ConfigurableEntity>().createObject(ConfigurableEntity.class);

        System.out.println("entity = " + entity);


    }

}
