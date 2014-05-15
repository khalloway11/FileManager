/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;
import java.util.regex.*;

/**
 * converts a string to a comma delimited string
 * @author Keiji
 */
public class CSVFormatStrat implements FormatStrat {
    private final Pattern pattern;
    private Matcher matcher;
    
    public CSVFormatStrat(){
        pattern = Pattern.compile("(\\s+)");
    }

    /**
     * return formatted string separated by commas
     * @param toWrite
     * @return comma delimited String of toWrite
     */
    @Override
    public String toFormat(String toWrite) {
        //return a string replacing spaces with commas
        matcher = pattern.matcher(toWrite);
        String out = matcher.replaceAll(",");
        return out;
    }
    
}
