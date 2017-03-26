package Reader;

import java.io.*;

/**
 * Created by Taron on 03/25/17.
 */
public class CSV_reader extends DataReader {

    @Override
    public int[] makeArray(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] strings = bufferedReader.readLine().split(",");
        int[] numbers = new int[strings.length];
        for(int i = 0;i < strings.length;i++){
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }
}
