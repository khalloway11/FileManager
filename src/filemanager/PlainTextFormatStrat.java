/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;

/**
 * leaves the format of text as is
 * @author Keiji
 */
public class PlainTextFormatStrat implements FormatStrat{

    public PlainTextFormatStrat(){}
    
    /**
     * plain text format - returns text as is.
     * @param toWrite
     * @return toWrite
     */
    @Override
    public String toFormat(String toWrite) {
        return toWrite;
    }
    
}
