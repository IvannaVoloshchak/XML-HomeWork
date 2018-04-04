package Task4;

import Task3.TouristVoucher;
import Task3.Transport;
import Task3.VoucherType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class STAXParserDemo {
    public static void main(String[] args) throws XMLStreamException {
        List<TouristVoucher> touristVoucherList = null;
        TouristVoucher touristVoucher = null;
        String tagContent = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader =
                factory.createXMLStreamReader(
                        ClassLoader.getSystemResourceAsStream("Task1_2_resources/touristVoucher.xml"));

        while(reader.hasNext()){
            int event = reader.next();

            switch(event){
                case XMLStreamConstants.START_ELEMENT:
                    if ("touristVoucher".equals(reader.getLocalName())){
                        touristVoucher = new TouristVoucher();
                        touristVoucher.setCountry( reader.getAttributeValue(0));
                    }
                    if("touristVoucher".equals(reader.getLocalName())){
                        if(touristVoucherList==null) {
                            touristVoucherList = new ArrayList<>();
                        }
                    }
                    break;

                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    switch(reader.getLocalName()){
                        case "touristVoucher":
                            touristVoucherList.add(touristVoucher);
                            break;
                        case "country":
                            touristVoucher.setCountry( tagContent);
                            break;
//                        case "hotelCharacteristics":
//                            touristVoucher.setHotelCharacteristics( tagContent);
//                            break;
                        case "transport":
                            touristVoucher.setTransport(Transport.valueOf(tagContent));
                            break;
                        case "numberDays":
                            touristVoucher.setNumberDays(Integer.valueOf(tagContent));
                            break;
                        case "numberNights":
                            touristVoucher.setNumberNights(Integer.valueOf(tagContent));
                            break;
                        case "voucherType":
                            touristVoucher.setVoucherType(VoucherType.valueOf(tagContent));
                            break;
                        case "cost":
                            touristVoucher.setCost(Double.valueOf(tagContent));
                            break;
                    }
                    break;

                case XMLStreamConstants.START_DOCUMENT:
                    touristVoucherList = new ArrayList<>();
                    break;
            }
        }
        //Print the touristVoucher list populated from XML
        for ( TouristVoucher touristVoucher1 : touristVoucherList){
            System.out.println(touristVoucher1);
        }
    }
}