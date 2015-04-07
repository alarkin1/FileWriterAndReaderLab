/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinputoutputlab;

import java.io.IOException;

/**
 *
 * @author Alex
 */
public class HandlerService {

    private OutputStrategy outputMechanism;
    private RecordFormatterStrategy formattingStrategy;
    private RecordInputStrategy recordInputMechanism;

    public final void outputFormattedRecords() throws IOException{
        outputMechanism.outputFormattedRecords(recordInputMechanism.retrieveRecords(), formattingStrategy);
    }

    public HandlerService(OutputStrategy outputMechanism, RecordFormatterStrategy formattingStrategy, RecordInputStrategy recordInputMechanism) {
        setOutputMechanism(outputMechanism);
        setFormattingStrategy(formattingStrategy);
        setRecordInputMechanism(recordInputMechanism);
    }

    public final void setOutputMechanism(OutputStrategy outputMechanism) {
        if (outputMechanism != null) {
            this.outputMechanism = outputMechanism;
        } else {
            throw new NullPointerException("outputMechanism cannot be null");
        }
    }

    public final void setFormattingStrategy(RecordFormatterStrategy formattingStrategy) {
        if (formattingStrategy != null) {
            this.formattingStrategy = formattingStrategy;
        } else {
            throw new NullPointerException("formattingStrategy cannot be null");
        }
    }

    public final void setRecordInputMechanism(RecordInputStrategy recordInputMechanism) {
        if (recordInputMechanism != null) {
            this.recordInputMechanism = recordInputMechanism;
        } else {
            throw new NullPointerException("recordInputMechanism cannot be null");
        }
    }

}
