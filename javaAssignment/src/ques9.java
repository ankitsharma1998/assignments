enum HouseType
{
    Flat, Floor, Villa, Bunglow
}
public class ques9 {
    HouseType house;

    public ques9(HouseType house)
    {
        this.house = house;
    }

    public void getPrice()
    {
        switch (house)
        {
            case Flat:
                System.out.println("Price for flat : Rs. 8 lakhs");
                break;
            case Floor:
                System.out.println("Price for floor : Rs. 14 lakhs");
                break;
            case Villa:
                System.out.println("Price for villa : Rs. 50 lakhs");
                break;
            case Bunglow:
                System.out.println("Price for bunglow : Rs. 2 crore");
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }


    public static void main(String[] args)
    {
        String house_type="Villa";
        ques9 object = new ques9(HouseType.valueOf(house_type));
        object.getPrice();
    }
}
