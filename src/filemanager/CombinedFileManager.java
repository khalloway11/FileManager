/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;

import java.io.*;

/**
 *
 * @author khalloway
 */
public class CombinedFileManager implements FileManagerStrat{
    private FileReaderStrat fr;
    private FileWriterStrat fw;
    private File data;
    
    public CombinedFileManager(String filepath, FileReaderStrat fr, FileWriterStrat fw){
        data = new File(filepath);
        this.fw = fw;
        this.fr = fr;
    }

    /**
     * write to file via FileWriter
     * @param toWrite string to write to file
     * @param mode should be 0 or null; no use in this class
     */
    @Override
    public void writeAppend(String toWrite, int mode){
        fw.writeAppend(toWrite, data);
    }
    
    /**
     * write to file via FileWriter
     * @param toWrite string to write to file
     * @param mode should be 0 or null; no use in this class
     */
    @Override
    public void writeNoAppend(String toWrite, int mode){
        fw.writeNoAppend(toWrite, data);
    }
    
    /**
     * read a specific line from the file
     * @param line the line to be read, starting with 1
     * @return the specified line as a String
     */
    @Override
    public String readLine(int line, int mode){
        return fr.readLine(data, line);
    }
    
    /**
     * print the contents of the file
     */
    @Override
    public void readAll(){
        fr.readAll(data);
    }

    
}
