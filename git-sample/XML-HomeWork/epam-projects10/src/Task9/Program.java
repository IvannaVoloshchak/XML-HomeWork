package Task9;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

//public class JAXBExample {

public class Program {
    public static void main(String[] args) {
        HotelCharacteristics characteristics =
                new HotelCharacteristics(4, FoodType.HB, 2, false, true);
        TouristVoucher voucher =
                new TouristVoucher("Ukraine", characteristics, Transport.CAR, 8, VoucherType.REST, 100.00);
        try {

            File file = new File("C:\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(TouristVoucher.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(voucher, file);
            jaxbMarshaller.marshal(voucher, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
