/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinputoutputlab;

import java.io.*;
import java.util.List;

/**
 *
 * @author Alex
 */
public class OutputFileWriter implements OutputStrategy {

    boolean append;
    File outputFile;

    public OutputFileWriter(boolean append, File outputFile) {
        this.append = append;
        this.outputFile = outputFile;
    }

    @Override
    public final void outputFormattedRecords(List<Record> listOfRecords, RecordFormatterStrategy recordFormatter) {
        try {
            PrintWriter outputMechanism = new PrintWriter(new BufferedWriter(new FileWriter(outputFile, append)));
            for (Record record : listOfRecords) {
                outputMechanism.append(recordFormatter.formatRecordAndReturnFormattedRecordStr(record) + "\n\n");
            }
            outputMechanism.close();
        } catch (IOException ioe) {
            //print out error message in the appropriate manner
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public void outputFormattedRecord(Record record, RecordFormatterStrategy recordFormatter) {
        try {
            PrintWriter outputMechanism = new PrintWriter(new BufferedWriter(new FileWriter(outputFile, append)));
            outputMechanism.append(recordFormatter.formatRecordAndReturnFormattedRecordStr(record) + "\n\n");
            outputMechanism.close();
        } catch (IOException ioe) {
            //print out error message in the appropriate manner
            System.out.println(ioe.getMessage());
        }
    }

}
