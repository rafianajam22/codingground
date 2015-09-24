public class HouseImpl implements House {
    public static void main(String args[])
    {
        HouseImpl houseImpl=new HouseImpl();
        houseImpl.getRooms();
        System.out.println(houseImpl.getTotalArea(1));
    }
    public void getRooms()
    {
        System.out.println("Room");
    }
    public int getBath(int houseId)
    {
        return 1;

    }
    public int getTotalArea(int houseId)
    {
        return 2;

    }
    public int getTotalCoveredArea(int houseId)
    {
        return 3;

    }
}