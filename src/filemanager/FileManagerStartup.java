/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filemanager;

import java.io.File;

/**
 *
 * @author Keiji
 */
public class FileManagerStartup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = ("src" + File.separatorChar + "test.txt");
        SimpleFileManager fmPlain = new SimpleFileManager(fileName, new PlainTextReader(), new PlainTextWriter());
        SimpleFileManager fmCSV = new SimpleFileManager(fileName, new CSVFileReader(), new CSVFileWriter());
        
        fmPlain.readAll();
        fmCSV.readAll();
        //System.out.println(fmCSV.readLine(4));
        //System.out.println(fmPlain.readLine(2));
    }
    
}
