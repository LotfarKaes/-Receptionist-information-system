/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Logger;
import javax.print.PrintService;

/**
 *
 * @author Lotfar Kaes
// */

/*
 * Developed at Kristianstad University with Combitech AB 
 * URL: http://www.hkr.se
 */



public class PrinterTest {

    // This is the name of the printer we want to use
    public static final String PRINTERNAME = "DYMO LabelWriter 450";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       printO();
//        PrinterHelper ph = new PrinterHelper();
//        
//      
//         printerJob is used handle one printer job
//        PrinterJob printerJob = PrinterJob.getPrinterJob();
//         The format is used to allow us to set the size of the paper
//         and the orientation
//        PageFormat pageFormat = printerJob.defaultPage();
//         The paper is used to set the params for the pageFormat
//        Paper paper = new Paper();
//         The size of the paper. *72 is used to be able to specify the size
//         in inch. The Paper.setSize() method takes the size as 1/72nds 
//         of an inch
//        double widthPaper = (2.750 * 72);
//        double heightPaper = (2.125 * 72);
//
//         Set up the paper
//        paper.setSize(widthPaper, heightPaper);
//        paper.setImageableArea(0, 0, widthPaper, heightPaper);
//       
//
//         Set up the page format
//        pageFormat.setPaper(paper);
//        pageFormat.setOrientation(PageFormat.LANDSCAPE);
//
//         Get all the printers
//        PrintService[] printService = PrinterJob.lookupPrintServices();
//
//         Go over all the printers and use the one we specified in PRINTERNAME
//        for (int i = 0; i < printService.length; i++) {
//            System.out.println(printService[i].getName());
//
//            if (printService[i].getName().equals(PRINTERNAME)) {
//                try {
//                     Do the accual printing
//                    printerJob.setPrintService(printService[i]);
//                    printerJob.setPrintable(new PrinterHelper(), pageFormat); 
//                    printerJob.print();
//                    ph.print(null, pageFormat, i);
//                               
//                    break;
//                } catch (PrinterException e) {
//                    Logger.getLogger(PrinterTest.class.getName(), e.getMessage());
//                }
//            }
//        }
    }
    
    public  static void printO(){
     PrinterHelper ph = new PrinterHelper();
        
      
        // printerJob is used handle one printer job
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // The format is used to allow us to set the size of the paper
        // and the orientation
        PageFormat pageFormat = printerJob.defaultPage();
        // The paper is used to set the params for the pageFormat
        Paper paper = new Paper();
        // The size of the paper. *72 is used to be able to specify the size
        // in inch. The Paper.setSize() method takes the size as 1/72nds 
        // of an inch
        double widthPaper = (2.750 * 72);
        double heightPaper = (2.125 * 72);

        // Set up the paper
        paper.setSize(widthPaper, heightPaper);
        paper.setImageableArea(0, 0, widthPaper, heightPaper);
       

        // Set up the page format
        pageFormat.setPaper(paper);
        pageFormat.setOrientation(PageFormat.LANDSCAPE);

        // Get all the printers
        PrintService[] printService = PrinterJob.lookupPrintServices();

        // Go over all the printers and use the one we specified in PRINTERNAME
        for (int i = 0; i < printService.length; i++) {
            System.out.println(printService[i].getName());

            if (printService[i].getName().equals(PRINTERNAME)) {
                try {
                    // Do the accual printing
                    printerJob.setPrintService(printService[i]);
                    printerJob.setPrintable(new PrinterHelper(), pageFormat); 
                    printerJob.print();
                    ph.print(null, pageFormat, i);
                               
                    break;
                } catch (PrinterException e) {
                    Logger.getLogger(PrinterTest.class.getName(), e.getMessage());
                }
            }
        }
    
    
    }
    
    
}
