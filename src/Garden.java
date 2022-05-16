public class Garden
{
    private boolean bloomingStatus;
    public Garden()
    {
        bloomingStatus = false;
    }

    public boolean isBlooming(boolean blooming)
    {
        if (blooming)
        {
            return true;
        }
        return false;
    }

    public String giveWater()
    {
        return "Sprayed water on the garden!";
    }
}
