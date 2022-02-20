import interfaces.*;
import org.junit.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.junit.jupiter.*;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class MessageTest {

    private Message message = new Message(){};

    @Test
    public void getTextTest() throws Exception {

        String instructions = message.getText("message");
        assertEquals("M:message", instructions);
    }

}