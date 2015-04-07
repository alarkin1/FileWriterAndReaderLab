/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinputoutputlab;

import java.util.List;

/**
 *
 * @author Alex
 */
public class OutputConsole implements OutputStrategy {

    @Override
    public void outputFormattedRecords(List<Record> arrayOfRecords, RecordFormatterStrategy recordForamtter) {
        for (Record record : arrayOfRecords) {
            System.out.println(recordForamtter.formatRecordAndReturnFormattedRecordStr(record) + "\n\n");
        }
    }

}
