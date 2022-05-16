public class Dog
{
    private boolean barkingStatus;

    public Dog()
    {
        barkingStatus = false;
    }

    public boolean isBarking(boolean barking)
    {
        if (barking)
        {
            return true;
        }
        return false;
    }

    public String giveWater()
    {
        return "Gave water to dog!";
    }
}
