package package1.package1_2;

import base.TestHelper;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test1_2 {

    @Test
    public void test1(){
        System.out.println(TestHelper.VERSION_P1 + " :package1.package1_2.Test1_2");
        assertThat(200).isEqualTo(100);
    }
}
