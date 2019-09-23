import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest
{
    @Test
     public void sumNumber()
    {
        int sum = 1 + 1;

        assertThat(sum).isEqualTo(2);
    }
}
