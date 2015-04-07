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
public interface OutputStrategy {
    
    public abstract void outputFormattedRecords(List<Record> arrayOfRecords, RecordFormatterStrategy recordForamtter);
    
    public abstract void outputFormattedRecord(Record records, RecordFormatterStrategy recordForamtter);
    
}
