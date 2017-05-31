package shiltd.lambd;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Developer on 5/31/2017.
 */
public interface MyIOAction{
    boolean ioAction(Reader rdr) throws IOException;
}
