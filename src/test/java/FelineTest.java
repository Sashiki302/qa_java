import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatFeline() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void getFamilyFeline() throws Exception {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensFeline1() throws Exception {
    Feline feline = new Feline();
    assertEquals(1, feline.getKittens());
    }
    @Test
    public void getKittensFelineCount() throws Exception {
    Feline feline = new Feline();
    assertEquals(5, feline.getKittens(5));
    }
}
