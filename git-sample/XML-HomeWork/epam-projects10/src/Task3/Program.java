package Task3;

import Task3.FoodType;
import Task3.HotelCharacteristics;

public class Program {
    public static void main(String[] args) {
        HotelCharacteristics characteristics =
                new HotelCharacteristics(4, FoodType.HB, 2, false, true);
        TouristVoucher voucher =
                new TouristVoucher("Ukraine", characteristics, Transport.CAR, 8,8, VoucherType.REST, 100.00);
    }
}
