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
public interface FileReaderStrat {
    /**
     * 
     * @param file
     * @return the line of text specified
     */
    public abstract String readLine(File file, int line);
    
    /**
     * 
     * @param file
     * @return print the entire contents of the file
     */
    public abstract void readAll(File file);
}
