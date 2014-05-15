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
public class SeparateFileManager implements FileManagerStrat {
    private File ticketFile;
    private File reportFile;
    private FileReaderStrat fr;
    private FileWriterStrat fw;
    
    public SeparateFileManager(String ticketFilePath, String reportFilePath, FileReaderStrat fr, FileWriterStrat fw){
        ticketFile = new File(ticketFilePath);
        reportFile = new File(reportFilePath);
        this.fr = fr;
        this.fw = fw;
    }

    /**
     * write to file via FileWriter
     * @param toWrite string to write to file
     * @param mode use 0 for ticket record, 1 for report record
     */
    @Override
    public void writeAppend(String toWrite, int mode){
        if(mode == 0){
            fw.writeAppend(toWrite, ticketFile);
        } else if(mode == 1){
            fw.writeAppend(toWrite, reportFile);
        } else {
            System.out.println("Invalid mode.");
        }
    }
    
    /**
     * write to file via FileWriter
     * @param toWrite string to write to file
     * @param mode use 0 for ticket record, 1 for report record
     */
    @Override
    public void writeNoAppend(String toWrite, int mode){
        if(mode == 0){
            fw.writeNoAppend(toWrite, ticketFile);
        } else if(mode == 1){
            fw.writeNoAppend(toWrite, reportFile);
        } else {
            System.out.println("Invalid mode.");
        }
    }
    
    /**
     * read a specific line from the file
     * @param line the line to be read, starting with 1
     * @param mode use 0 for ticket record, 1 for report record
     * @return the specified line as a String
     */
    @Override
    public String readLine(int line, int mode){
        if(mode == 0){
            return fr.readLine(ticketFile, line);
        } else if(mode == 1){
            return fr.readLine(reportFile, line);
        } else {
            return "Not found.";
        }
    }
    
    /**
     * print the contents of the file
     */
    @Override
    public void readAll(){
        fr.readAll(ticketFile);
        fr.readAll(reportFile);
    }
    
}
