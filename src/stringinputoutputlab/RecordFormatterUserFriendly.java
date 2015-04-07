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
public class RecordFormatterUserFriendly implements RecordFormatterStrategy{

    @Override
    public final String formatRecordAndReturnFormattedRecordStr(Record record) {
        String formattedStrRecord = "";
        formattedStrRecord += "First Name: " + record.getFirstName() + "\n";
        formattedStrRecord += "Last Name: " + record.getLastName() + "\n";
        formattedStrRecord += "City, State: " + record.getCity() + " " + record.getState() + "\n";
        formattedStrRecord += "Address: " + record.getAddress();
        formattedStrRecord += "Zip: " + record.getZip();
        return formattedStrRecord;
    }
}
