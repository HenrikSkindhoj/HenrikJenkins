import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

        @Test
        public void add(){
            var sc = new StringCalculator();
            assertEquals(3,sc.add("//;\n1;2"));
        }

}