package package2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Test1 {
    @Test
    public void test1(){
        System.out.println("package2.Test1");
        assertThat(200).isEqualTo(200);
    }
}
