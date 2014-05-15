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
public class FileManager {
    private FileReaderStrat fr;
    private FileWriterStrat fw;
    private File data;
    
    public FileManager(String filePath, FileReaderStrat fr, FileWriterStrat fw){
        data = new File(filePath);
        this.fw = fw;
        this.fr = fr;
    }

    public FileReaderStrat getFr() {
        return fr;
    }

    public void setFr(FileReaderStrat fr) {
        this.fr = fr;
    }

    public FileWriterStrat getFw() {
        return fw;
    }

    public void setFw(FileWriterStrat fw) {
        this.fw = fw;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }
    
    /**
     * write to file via FileWriter
     * @param toWrite string to write to file
     */
    public void writeAppend(String toWrite){
        fw.writeAppend(toWrite, data);
    }
    
    /**
     * write to file via FileWriter
     * @param toWrite string to write to file
     */
    public void writeNoAppend(String toWrite){
        fw.writeNoAppend(toWrite, data);
    }
    
    /**
     * read a specific line from the file
     * @return the specified line as a String
     */
    public String readLine(int line){
        return fr.readLine(data, line);
    }
    
    /**
     * print the contents of the file
     */
    public void readAll(){
        fr.readAll(data);
    }
}
