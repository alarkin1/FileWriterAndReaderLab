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
public class RecordInputRecordObject implements RecordInputStrategy {

    Record record;

    public RecordInputRecordObject(Record record) {
        setRecord(record);
    }

    @Override
    public List<Record> retrieveRecords(){
        
    }

    private void setRecord(Record record) {
        if (record != null) {
            this.record = record;
        }
    }

}
