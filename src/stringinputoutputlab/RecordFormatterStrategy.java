/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinputoutputlab;

/**
 *
 * @author Alex
 */
public interface RecordFormatterStrategy {
    
    public abstract String formatRecordAndReturnFormattedRecordStr(Record record);
    
}
