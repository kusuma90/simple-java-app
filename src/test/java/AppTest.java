import com.example.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testSum(){
        assertEquals(30, App.sum(10,20));
    }
}
