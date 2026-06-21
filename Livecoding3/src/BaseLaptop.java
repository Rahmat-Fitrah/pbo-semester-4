public abstract class BaseLaptop implements Laptop{
    protected int volume;
    protected boolean isPowerOn;

    public BaseLaptop(){
        this.volume = 50;
        this.isPowerOn = false;
    }

    public int getVolme(){
        return volume;
    }
}
