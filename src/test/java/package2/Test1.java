package package2;

import base.TestHelper;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Test1 {
    @Test
    public void test1(){
        System.out.println(TestHelper.VERSION_P2 + " :package2.Test1_2");
        assertThat(200).isEqualTo(200);
    }
}
