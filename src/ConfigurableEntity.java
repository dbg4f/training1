/**
 * Created by Tanja on 10/14/2015.
 */
public class ConfigurableEntity {

    @InjectRandomInt(min = 5, max = 20)
    int target = 0;


    @Override
    public String toString() {
        return "ConfigurableEntity{" +
                "target=" + target +
                '}';
    }
}
