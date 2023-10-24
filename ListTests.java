import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
	@Test 
	public void filterTest() {
    StringChecker sc = new StringChecker() {
      @Override
      public boolean checkString(String s) {
          return s.startsWith("s");
      }};

    List<String> input1 = Arrays.asList(new String[]{"something", "nothing"});

    ListExamples.filter(input1, sc);
    assert
	}

}
