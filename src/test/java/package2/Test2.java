package package2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test2 {
    @Test
    public void test1(){
        System.out.println("package2.Test2");
        assertThat(200).isEqualTo(100);
    }
}
