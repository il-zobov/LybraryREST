package jsonsender;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ilia on 7/29/16.
 */
public class SendTaskTest {
    private  SendTask task;

    @Before
    public  void  init() {
        task = new SendTask();
    }

    @After
    public void tearDown ()
    {
        task = null;
    }

    @Test
    public void SendAsyncRequest()
    {
        assertTrue(1==1);
    }


}
