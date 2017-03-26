import Action.Action;
import Action.Action1;
import Reader.CSV_reader;
import Reader.DataReader;
import Reader.NLSV_reader;
import Reader.TSV_reader;

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
                System.out.println("Action 1: ");
                System.out.println("Sum numbers is: " + obj.doAction(dataReader.makeArray(FILEPATH + fileName)));
                break;
            }
            case 2: {
                Action obj = new Action2();
                System.out.println("Action 2: ");
                System.out.println("Sum numbers is: " + obj.doAction(dataReader.makeArray(FILEPATH + fileName)));
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
