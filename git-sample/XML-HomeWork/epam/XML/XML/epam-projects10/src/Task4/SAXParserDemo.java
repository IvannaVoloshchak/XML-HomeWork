package Task4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import Task3.TouristVoucher;
import Task3.Transport;
import Task3.VoucherType;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserDemo {
    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(ClassLoader.getSystemResourceAsStream("Task1_2_resources/touristVoucher.xml"), handler);

        for (TouristVoucher touristVoucher : handler.touristVoucherList) {
            System.out.println(touristVoucher);
        }
    }
}

class SAXHandler extends DefaultHandler {

    List<TouristVoucher> touristVoucherList = new ArrayList<>();
    TouristVoucher touristVoucher = null;
    String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        switch (qName) {
            case "touristVoucher":
                touristVoucher = new TouristVoucher();
                touristVoucher.setCountry(attributes.getValue("country"));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {

            case "touristVoucher":
                touristVoucherList.add(touristVoucher);
                break;

            case "country":
                touristVoucher.setCountry(content);
                break;
//            case "hotelCharacteristics":
//                touristVoucher.setHotelCharacteristics( content);
//                break;
            case "transport":
                touristVoucher.setTransport(Transport.valueOf(content));
                break;
            case "numberDays":
                touristVoucher.setNumberDays(Integer.valueOf(content));
                break;
            case "numberNights":
                touristVoucher.setNumberNights(Integer.valueOf(content));
                break;
            case "voucherType":
                touristVoucher.setVoucherType(VoucherType.valueOf(content));
                break;
            case "cost":
                touristVoucher.setCost(Double.valueOf(content));
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

}
