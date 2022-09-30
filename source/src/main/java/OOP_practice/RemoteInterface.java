package OOP_practice;

public interface RemoteInterface {
    void start();
    void stop();
    void pause();
    int changeToAnotherChannel(int channelNumber);
    int changePreviousChannel();
    int changeNextChannel();
    boolean record();
    boolean recordStop();
    boolean turnON();
    boolean turnOFF();
    int volumeUP();
    int volumeDOWN();

}
