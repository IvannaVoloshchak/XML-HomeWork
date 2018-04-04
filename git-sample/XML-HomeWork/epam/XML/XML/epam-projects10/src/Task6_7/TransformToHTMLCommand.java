package Task6_7;

import org.xml.sax.SAXException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;

public class TransformToHTMLCommand  {

public static void main(String[] args) {
    try{
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer=transformerFactory.newTransformer(new StreamSource(new File("src\\Task1_2_resources\\voucher.xslt")));
        StreamSource streamSource= new StreamSource(new File("src\\Task1_2_resources\\touristVoucher.xml"));
        StreamResult streamResult = new StreamResult(new File("src\\Task1_2_resources\\touristVoucher.html"));
        transformer.transform(streamSource,streamResult);
        System.out.println("Done");
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
}
}
