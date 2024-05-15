import java.util.List;

// Hotel.java setelah hasil refactor
public class Hotel extends HotelStar {
    private String HotelId; // ubah menjadi private
    private String HotelName;
    private String Address;
    private List<String> RoomType;

    public Hotel() {
    }

    public String getHotelId() {
        return HotelId;
    }

    public void setHotelId(String hotelId) {
        HotelId = hotelId;
    }

    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    public String getHotelName() {
        return HotelName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<String> getRoomType() {
        return RoomType;
    }

    public void setRoomType(List<String> roomType) {
        RoomType = roomType;
    }
}

