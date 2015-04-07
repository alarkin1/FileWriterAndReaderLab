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
public interface RecordInputStrategy {
    public abstract List<Record> retrieveRecords() throws IOException;
}
