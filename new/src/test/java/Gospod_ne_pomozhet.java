import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Gospod_ne_pomozhet {
    @Test
    public void test(){
        int[] i = {5,4,3,2,1};
        int[] j = {1,2,3,4,5};
        Gospodi_zarabotai_ples.sort(i);
        Assertions.assertArrayEquals(i,j);
    }
}
