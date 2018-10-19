package thetif;

/*import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class excel {
    public void check()
    {
        dashboard dash = new dashboard();
        Vector headers = new Vector();
        Vector data = new Vector();
        
        File file = new File("D:\\attendance.xls");
        try 
        {
            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
            headers.clear();
            for (int i = 0; i < sheet.getColumns(); i++)
            {
                Cell cell1 = sheet.getCell(i, 0);
                headers.add(cell1.getContents());
            }
            data.clear();
            for (int j = 1; j < sheet.getRows(); j++) 
            {
                Vector d = new Vector();
                for (int i = 0; i < sheet.getColumns(); i++)
                {
                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                data.add(d);
            }
        }
        catch (Exception e) {
        e.printStackTrace();
        }
        DefaultTableModel model = new DefaultTableModel(data,headers);
        attendance_check.setModel(model);
        attendance_check.setAutoCreateRowSorter(true);
        model = new DefaultTableModel(data, headers);
        attendance_check.setModel(model);
        attendance_check.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
    }
}*/