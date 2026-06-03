import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
    public class CatTest {
@Mock
    private Feline mockFeline;
@Test
    public void getSoundCat(){
    Cat cat = new Cat(mockFeline);
    assertEquals("Мяу", cat.getSound());
    }
@Test
    public void getFoodCat() throws Exception{
    Cat cat = new Cat(mockFeline);
    Mockito.when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
