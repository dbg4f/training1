import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Tanja on 10/14/2015.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {
    int max() default 0;
    int min() default 10;



}
