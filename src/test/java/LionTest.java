import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline mockFeline;

    @Test
    public void doesHaveManeLionFalse() throws Exception {
        Lion lion = new Lion(mockFeline,"Самка");
        assertFalse(lion.doesHaveMane());
    }
    @Test
    public void doesHaveManeException() {
       Exception exception = assertThrows(Exception.class, () -> {
           new Lion(mockFeline, "Неизвестно");});
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
    @Test
    public void getKittensLionCount() throws Exception {
        Lion lion = new Lion(mockFeline, "Самец");
    Mockito.when(mockFeline.getKittens()).thenReturn(5);
    assertEquals(5, lion.getKittens());
}
    @Test
    public void getFoodLion() throws Exception {
        Lion lion = new Lion(mockFeline, "Самка");
        List<String> meat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(meat);
        assertEquals(meat, lion.getFood());
    }
}
