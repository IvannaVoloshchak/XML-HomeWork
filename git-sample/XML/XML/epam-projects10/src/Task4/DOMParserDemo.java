package Task4;

import Task3.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class DOMParserDemo {

    public static void main(String[] args) throws Exception {
        //Get the DOM Builder Factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //Get the DOM Builder
        DocumentBuilder builder = factory.newDocumentBuilder();
        //Load and Parse the XML document
        //document contains the complete XML as a Tree.
        Document document = builder.parse(
                ClassLoader.getSystemResourceAsStream("Task1_2_resources/touristVoucher.xml"));
        List<TouristVoucher> touristVouchersList = new ArrayList<>();

        //Iterating through the nodes and extracting the data.
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

            //We have encountered an <voucher> tag.
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                TouristVoucher touristVoucher = new TouristVoucher();
                touristVoucher.setCountry( ((Element) node).getElementsByTagName("country").item(0).getTextContent());

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    //Identifying the child tag of vouchers encountered.
                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "country":
                                touristVoucher.setCountry(content) ;
                                break;
                            case "hotelCharacteristics":
                                HotelCharacteristics hotelCharacteristics = createHotelCharacteristics((((Element) node).getElementsByTagName("hotelCharacteristics")).item(0));
                                touristVoucher.setHotelCharacteristics(hotelCharacteristics);
                                break;
                            case "transport":
                                touristVoucher.setTransport(Transport.valueOf((((Element) node).getElementsByTagName("transport").item(0).getTextContent())));
                                break;
                            case "voucherType":
                                touristVoucher.setVoucherType(VoucherType.valueOf((((Element) node).getElementsByTagName("voucherType").item(0).getTextContent())));
                                break;
                            case "numberDays":
                                touristVoucher.setNumberDays(Integer.parseInt(((Element) node).getElementsByTagName("numberDays").item(0).getTextContent()));
                            case "numberNights":
                                touristVoucher.setNumberNights(Integer.parseInt(((Element) node).getElementsByTagName("numberNights").item(0).getTextContent()));
                            case "cost":
                                touristVoucher.setCost(Double.parseDouble(((Element) node).getElementsByTagName("cost").item(0).getTextContent()));

                        }
                    }
                }
                touristVouchersList.add(touristVoucher);
            }

        }
        //Printing the Task3.TouristVoucher list populated.
        for (TouristVoucher touristVoucher : touristVouchersList) {
            System.out.println(touristVoucher);
        }

    }
    private static HotelCharacteristics createHotelCharacteristics(Node node){
        int stars = Integer.parseInt(((Element)node).getElementsByTagName("stars").item(0).getTextContent());
        int bedCount = Integer.parseInt(((Element)node).getElementsByTagName("bedCount").item(0).getTextContent());
        boolean conditionerPresent = Boolean.parseBoolean((((Element)node).getElementsByTagName("conditionerPresent").item(0).getTextContent()));
        FoodType foodType = FoodType.valueOf((((Element)node).getElementsByTagName("foodType").item(0).getTextContent()));
        boolean tvPresent = Boolean.parseBoolean((((Element)node).getElementsByTagName("TVPresent").item(0).getTextContent()));
        HotelCharacteristics hotelCharacteristics = new HotelCharacteristics();
        hotelCharacteristics.setBedCount(bedCount);
        hotelCharacteristics.setStars(stars);
        hotelCharacteristics.setConditionerPresent(conditionerPresent);
        hotelCharacteristics.setFoodType(foodType);
        hotelCharacteristics.setTVPresent(tvPresent);
        return hotelCharacteristics;
    }
}

