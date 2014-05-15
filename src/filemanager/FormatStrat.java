/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;

/**
 *
 * @author Keiji
 */
public interface FormatStrat {
    /**
     * Format a string to the specified format
     * @param toWrite
     * @return formatted string
     */
    public abstract String toFormat(String toWrite);
}
