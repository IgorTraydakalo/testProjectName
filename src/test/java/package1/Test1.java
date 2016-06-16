package package1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test1 {

    @Test
    public void test1(){
        System.out.println("package1.Test1");
        assertThat(200).isEqualTo(200);
    }
}
