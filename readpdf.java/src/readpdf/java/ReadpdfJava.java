
package readpdf.java;
import java.io.*;
import org.apache.pdfbox.util.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.exceptions.COSVisitorException;
import java.util.List;
import java.util.Iterator;

public class ReadpdfJava {
   public static void main(String[] args) throws IOException {
      PDDocument document = new PDDocument();
        document = PDDocument.load("F:\\7 sem\\machine learning\\imp.pdf");  
        int count = document.getNumberOfPages();
        PDDocument document1 = new PDDocument();
        PDDocument document2=new PDDocument();
       // PDPage doc = document.getPage(0);
        int i=0;
        try {   
   // document = new PDDocument();   
           while(i!=count){
         if(i%2==0)
      document1.addPage((PDPage)document.getDocumentCatalog().getAllPages().get(i));
          //document1.save("file path"+"new document title"+".pdf");  
          else
         document2.addPage((PDPage)document.getDocumentCatalog().getAllPages().get(i));
          document1.save("first.pdf");
        document2.save("second.pdf");
         //document.close();  
           i++;
           }
}catch(Exception e){}
       // document1.save("first.pdf");
        //document2.save("second.pdf");
        document1.close();
        document2.close();
        document.close();
        // TODO code application logic here
    }
}
