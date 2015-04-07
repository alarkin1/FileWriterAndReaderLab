/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinputoutputlab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 */
public class TextFileRecordParser {

    public final List<Record> readTextFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        List<Record> listOfRecords = new ArrayList<>();
        while (line != null) {
            Record newRecord = new Record();
            int i = 0;
            while (line.isEmpty() == false) {
                String[] lineSplit = line.split(" ");
                if (i == 0) {
                    newRecord.setFirstName(lineSplit[0]);
                    newRecord.setLastName(lineSplit[1]);
                }

                if (i == 1) {
                    newRecord.setAddress(lineSplit[0] + " " + lineSplit[1]);
                }

                if (i == 2) {
                    newRecord.setCity(lineSplit[0]);
                    newRecord.setState(lineSplit[1]);
                    newRecord.setZip(lineSplit[2]);
                    listOfRecords.add(newRecord);
                    break;
                }
                i++;
                line = bufferedReader.readLine();
            }
            line = bufferedReader.readLine();
        }
        return listOfRecords;
    }

}
