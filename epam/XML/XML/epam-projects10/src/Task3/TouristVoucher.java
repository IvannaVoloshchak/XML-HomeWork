package Task3;

import Task3.HotelCharacteristics;

public class TouristVoucher {
    private String country;
    private HotelCharacteristics hotelCharacteristics;
    private Transport transport;
    private int numberDays;
    private int numberNights;
    private VoucherType voucherType;
    private double cost;

    public TouristVoucher() {
    }

    TouristVoucher(String country, HotelCharacteristics hotelCharacteristics, Transport transport, int numberDays, int numberNights, VoucherType voucherType, double cost) {
        this.country = country;
        this.hotelCharacteristics = hotelCharacteristics;
        this.transport = transport;
        this.numberDays = numberDays;
        this.numberNights = numberNights;
        this.voucherType = voucherType;
        this.cost = cost;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HotelCharacteristics getHotelCharacteristics() {
        return hotelCharacteristics;
    }

    public void setHotelCharacteristics(HotelCharacteristics hotelCharacteristics) {
        this.hotelCharacteristics = hotelCharacteristics;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public int getNumberNights() {
        return numberNights;
    }

    public void setNumberNights(int numberNights) {
        this.numberNights = numberNights;
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(VoucherType voucherType) {
        this.voucherType = voucherType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TouristVoucher{" +
                "country='" + country + '\'' +
                ", hotelCharacteristics=" + hotelCharacteristics +
                ", transport=" + transport +
                ", numberDays=" + numberDays +
                ", numberNights=" + numberNights +
                ", voucherType=" + voucherType +
                ", cost=" + cost +
                '}';
    }
   }
