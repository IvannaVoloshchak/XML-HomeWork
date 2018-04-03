package Task9;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class TouristVoucher {
    String country;
    HotelCharacteristics hotelCharacteristics;
    Transport transport;
    int numberDays;
    int numberNights;
    VoucherType voucherType;
    double cost;
    TouristVoucher(){
            }
    TouristVoucher(String country, HotelCharacteristics hotelCharacteristics, Transport transport, int numberDays, VoucherType voucherType, double cost) {
        this.country=country;
        this.hotelCharacteristics = hotelCharacteristics;
        this.transport=transport;
        this.numberDays=numberDays;
        this.voucherType=voucherType;
        this.cost=cost;

    }

    public String getCountry() {
        return country;
    }
    @XmlElement
    public void setCountry(String country) {
        this.country = country;
    }

    public HotelCharacteristics getHotelCharacteristics() {
        return hotelCharacteristics;
    }
    @XmlElement
    public void setHotelCharacteristics(HotelCharacteristics hotelCharacteristics) {
        this.hotelCharacteristics = hotelCharacteristics;
    }

    public Transport getTransport() {
        return transport;
    }
    @XmlElement
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getNumberDays() {
        return numberDays;
    }
    @XmlElement
    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public int getNumberNights() {
        return numberNights;
    }
    @XmlElement
    public void setNumberNights(int numberNights) {
        this.numberNights = numberNights;
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }
    @XmlElement
    public void setVoucherType(VoucherType voucherType) {
        this.voucherType = voucherType;
    }

    public double getCost() {
        return cost;
    }
    @XmlElement
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString(){
        return country +" " + hotelCharacteristics+ " " + transport + "" +numberDays +" " +voucherType+" "+ cost+" ";
    }

   }
