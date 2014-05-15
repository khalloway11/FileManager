/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;
import java.io.*;
/**
 *
 * @author Keiji
 */
public interface FileWriterStrat {
    /**
     * append the String to the file
     * @param toWrite
     * @param file 
     */
    public abstract void writeAppend(String toWrite, File file);
    
    /**
     * overwrite the file with the String
     * @param toWrite
     * @param file 
     */
    public abstract void writeNoAppend(String toWrite, File file);
}
