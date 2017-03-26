package Reader;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Taron on 03/25/17.
 */
public abstract class DataReader {


    public abstract int[] makeArray(String path) throws IOException;

}
