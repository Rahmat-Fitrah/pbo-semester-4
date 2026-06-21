public class Macbook extends BaseLaptop{
    @Override
    public void PowerOn(){
        isPowerOn = true;
        System.out.println("Macbook menyala... wellcome Macbook");
    }

    @Override
    public void PowerOff(){
        isPowerOn = false;
        System.out.println("Macbook mematikan sistem");
    }

    @Override
    public void volumeUp(){
        if (isPowerOn) {
            if (this.volume < MAX_VOLUME) this.volume +=10;
            System.out.println("Volume Macbook : "+this.getVolme());
        }else{
            System.out.println("Nylakan Terlebih dahulu");
        }
    }

    @Override
    public void volumeDown(){
        if (isPowerOn) {
            if (this.volume > MIN_VOLUME) this.volume -=10;
            System.out.println("Volume Macbook : "+this.getVolme());
        }else{
            System.out.println("Nylakan Terlebih dahulu");
        }
    }
}
