/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Lotfar Kaes
 */

/*
 * Developed at Kristianstad University with Combitech AB 
 * URL: http://www.hkr.se
 */


/**
 *
 * @author Your Andreas Nilsson <andreas.nilsson@hkr.se>
 */
public class PrinterHelper implements Printable {

    // We will only use one page (label)
    private int nbrPages = 1;
    private BufferedImage image;
    PrinterTest pt = new PrinterTest();

    /**
     * Constructor, will create the image stored in resources.
     */
    public PrinterHelper() {
        try {
            URL imageURL = PrinterHelper.class.getResource("/image/COMBITECH.GIF");
           
            image = ImageIO.read(imageURL);
        } catch (IOException ex) {
            Logger.getLogger(this.getClass().getName(), ex.getMessage());
        }
    }
    
    /**
     * Number of pages
     * @return The number of pages to print
     */
    public int getNbrPages() {
        return nbrPages;
    }
   
    public BufferedImage getImage(BufferedImage image){
        return image;
    
    }

    /**
     * Prints the label
     * 
     * @param graphics The object to use for printing
     * @param pageFormat The format of the page
     * @param pageIndex What page index to print
     * @return If page exists or not
     * @throws PrinterException Will be thrown if any error occurs during the printing process.
     */
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex < getNbrPages()) {
            Graphics2D g = (Graphics2D) graphics;
            DateFormat df = new SimpleDateFormat("EEE d MMM yyyy");
            Date date = new Date();
            
            // Move the origin to get a bit in x direction
            g.translate(20, 0);
            // Use a nice font
            g.setFont(new Font(g.getFont().getFontName(), Font.BOLD, 10));

            // What if we want to print a image? We should move the origin 
            // a bit in y so the image fits.
            //g.translate(0, 10);
            //g.drawImage(image, 0, 0, null);
            
            // What if we want to print some text?
            g.drawString("COMBITECH   (" + df.format(date) + ")", 0, 40);
            g.drawString("VISITOR : Andreas Nilsson", 0, 50);
            g.drawString("CONTACT : Daniel Hedman", 0, 65);

            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
}
