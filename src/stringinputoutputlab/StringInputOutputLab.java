/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinputoutputlab;

import java.io.*;

/**
 *
 * @author Alex
 */
public class StringInputOutputLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File(File.separatorChar + "Temp" + File.separatorChar + "contacts.txt");
        File outputFile = new File(File.separatorChar + "Temp" + File.separatorChar + "contacts2.txt");
        RecordInputStrategy newTextFileRecordParser = new RecordInputTextFile(file);
        try {
            OutputStrategy recordOutputter = new OutputConsole();
            recordOutputter.outputFormattedRecords(newTextFileRecordParser.retrieveRecords(), new RecordFormatterUserFriendly());
            recordOutputter = new OutputFileWriter(true, outputFile);
            recordOutputter.outputFormattedRecords(newTextFileRecordParser.retrieveRecords(), new RecordFormatterUserFriendly());
            recordOutputter = new OutputConsole();
            recordOutputter.outputFormattedRecords(newTextFileRecordParser.retrieveRecords(), new RecordFormatterUserFriendly());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
