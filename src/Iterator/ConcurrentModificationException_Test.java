package Iterator;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class ConcurrentModificationException_Test {
    public static void main(String[] args) {
        new ConcurrentModificationException_Test().testForEachFail();
    }

   // @Test(expected = ConcurrentModificationException.class)
    public void testForEachFail() { // https://dev64.wordpress.com/2013/03/11/how-to-deal-with-concurrent-modification-exception/
        Map<String,String> map = new HashMap<String,String>();
        map.put("a", "a");
        map.put("b", "b");

        for(String key:map.keySet()) {
            map.remove(key);
        }
    }
}
