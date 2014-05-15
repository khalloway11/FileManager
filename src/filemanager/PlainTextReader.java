/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Keiji
 */
public class PlainTextReader implements FileReaderStrat {
    private FormatStrat fs;
    private BufferedReader in;

    public PlainTextReader() {
        this.fs = new PlainTextFormatStrat();
    }

    public FormatStrat getFs() {
        return fs;
    }

    public void setFs(FormatStrat fs) {
        this.fs = fs;
    }

    /**
     * 
     * @param file the file to be searched
     * @param line the line to be read, starting from 1
     * @return the line if found as a String, else null
     */
    @Override
    public String readLine(File file, int line) {
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
            return null;
        }
        
        int count = 1;
        try {
           String out = in.readLine();
	   while(out != null){
               if(count == line){
                   out = fs.toFormat(out);
                   return out;
               } else {
                   out = in.readLine();
               }
               count++;
           }

        } catch(IOException ioe) {
            System.out.println("Error reading file");
        } finally {
            try {
                in.close();
            } catch(IOException e) {
                
            }
        }
        return null;
    }

    /**
     * print the entire contents of the file
     * @param file 
     */
    @Override
    public void readAll(File file) {
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
            return;
        }
        
        try {
	   String line = in.readLine();
	   while(line != null){
               line = fs.toFormat(line);
                  System.out.println(line);
		  line = in.readLine();  
	   }

        } catch(IOException ioe) {
            System.out.println("Error reading file.");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }
    
}
