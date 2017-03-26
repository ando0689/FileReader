import action.Action;
import action.Action1;
import action.Action2;
import action.Action3;
import reader.CSV_reader;
import reader.DataReader;
import reader.NLSV_reader;
import reader.TSV_reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Taron on 03/25/17.
 */
public class Client {
    final String FILEPATH = "D:\\projects\\FileReader\\src\\";
    public void start() throws IOException {
        System.out.println("Enter file name.");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("Enter task number.");
        int numberId = scanner.nextInt();
        DataReader dataReader = fileExtention(fileName);
        try {
            dataReader.makeArray(FILEPATH + fileName);
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        switch (numberId){
            case 1: {
                Action obj = new Action1();
                System.out.println("action 1: ");
                System.out.println("Sum numbers is: " + obj.doAction(dataReader.makeArray(FILEPATH + fileName)));
                break;
            }
            case 2: {
                Action obj = new Action2();
                System.out.println("action 2: ");
                System.out.println("Sum numbers is: " + obj.doAction(dataReader.makeArray(FILEPATH + fileName)));
                break;
            }
            case 3: {
                Action obj = new Action3();
                System.out.println("action 3: ");
                obj.doAction(dataReader.makeArray(FILEPATH + fileName));
                break;
            }
        }
    }

    public DataReader fileExtention(String filename){
        switch (filename.substring(filename.indexOf('.') + 1,filename.length())){
            case "csv" : {
                System.out.println("csv file");
                return new CSV_reader();
            }
            case "tsv": {
                System.out.println("tsv file");
                return new TSV_reader();
            }
            case "nlsv": {
                System.out.println("nlsv file");
                return new NLSV_reader();
            }
        }
        return null;
    }
}
