public interface Laptop {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void PowerOn();
    void PowerOff();
    void volumeUp();
    void volumeDown();
}
