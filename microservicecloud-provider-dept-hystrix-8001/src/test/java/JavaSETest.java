import com.codeman.springcloud.entities.Dept;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-14
 * Time:14:41
 */
public class JavaSETest {
    Dept dept = new Dept();
    @Test
    public void test() {
        Class aclass = Dept.class;
        if (Dept.class.isAssignableFrom(aclass)) {
            System.out.println("相同");
        }
//        Member.class.isAssignableFrom(aClass)
    }
}
