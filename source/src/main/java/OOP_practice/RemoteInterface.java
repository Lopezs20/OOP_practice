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
    boolean turnON(Television tv);
    boolean turnOFF(Television tv);
    int volumeUP();
    int volumeDOWN();

}
