package OOP_practice;

import java.security.Timestamp;
import java.util.ArrayList;

public class TV_remote implements RemoteInterface{

    protected int remote_volume = 0;

    private boolean powerStatus = false; 

    public TV_remote(){
        
    }
    
    //TODO make a tv interface or use remote interface to relect these methods towards tv obj.
    // make sure that passing tv obj is soley abstracted and not used anywhwere else.

    public int volumeUP(Television tv){
        this.remote_volume = 5 + this.remote_volume;
        tv.volume(remote_volume);
        return this.remote_volume;
    }

    public int volumeDOWN(Television tv){
        this.remote_volume = -5 + this.remote_volume;
        tv.volume(remote_volume);
        return this.remote_volume;
    }

    public boolean turnON(Television teleV){
        //set function to turn on at television obj rather than use global var here
        teleV.powerON();
        return powerStatus = true;
    }

    public boolean turnOFF(Television teleV){
        teleV.powerOFF();
        return powerStatus = false;
    }

    public void checkPowerStatus(){
        System.out.println("Power Status: " + powerStatus);
    }

    public boolean record(){
        System.out.println("Recording has started. Press RECORD STOP when finished.");
        return true;
    }   

    public boolean recordStop(){
        System.out.println("Recording has ended...");
        return false;
    } 

    public void start(){
        System.out.println("Broadcast has resumed!\nYou are watching prime time television!");
    }   

    public void stop(){
        System.out.println("Broadcast has been stopped!\nPress start to continue prime time television.");
    }

    public void pause(){
        System.out.println("Broadcast has paused!\nPress start to resume prime time television"); 
    }

    public int changeToAnotherChannel(int channelNumber){
        return channelNumber;
    }

    public int changePreviousChannel(){
        return -1;
    }
    public int changeNextChannel(){
        return 1;
    }

}
