/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencia;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
 
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import com.itextpdf.text.pdf.PdfPTable;

/**
 *
 * @author Famil
 */
public class GenerarPdf {
    
    private Font fuente1 = new Font(Font.FontFamily.COURIER,16,Font.BOLD);
    private Font fuente2 = new Font(Font.FontFamily.COURIER,14,Font.NORMAL);
    private Font fuente3 = new Font(Font.FontFamily.COURIER,10,Font.ITALIC);
    
    public void generarPdf(String titulo,String Titulo2,String texto, String pie,String ruta,String salida, PdfPTable Tv){
        try {
            Document d = new Document(PageSize.A4,36,36,10,10);
            PdfWriter.getInstance(d,new FileOutputStream(salida));
            d.open();
            Image imagen = Image.getInstance(ruta);
            imagen.scaleAbsolute(200,120);
            imagen.setAlignment(Element.ALIGN_TOP);
            d.add(imagen);
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTitulo(titulo));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(Tv);
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTitulo(Titulo2));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(texto));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getTexto(" "));
            d.add(getPie(pie));
            d.close();
            JOptionPane.showMessageDialog(null, "Pdf agregado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el pdf. Error: "+e);
        }
    }
    
    private Paragraph getTitulo(String Texto){
        Paragraph p = new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuente1);
        p.add(c);
        return p;
    }
    
    private Paragraph getTexto(String Texto){
        Paragraph p = new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_JUSTIFIED);
        c.append(Texto);
        c.setFont(fuente2);
        p.add(c);
        return p;
    }
    
    private Paragraph getPie(String Texto){
        Paragraph p = new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_RIGHT);
        c.append(Texto);
        c.setFont(fuente3);
        p.add(c);
        return p;
    }
}
