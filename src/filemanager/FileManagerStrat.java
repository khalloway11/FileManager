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
public interface FileManagerStrat {
    public abstract void writeAppend(String toWrite, int mode);
    public abstract void writeNoAppend(String toWrite, int mode);
    public abstract String readLine(int line, int mode);
    public abstract void readAll();
}
