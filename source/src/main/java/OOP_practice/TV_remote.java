package OOP_practice;

import java.security.Timestamp;
import java.util.ArrayList;

public class TV_remote implements RemoteInterface{
    
    protected int remote_volume = 0;

    public TV_remote(){
        
    }
    
    public int volumeUP(){
        return 5 + this.remote_volume;
    }

    public int volumeDOWN(){
        return -5 + this.remote_volume;
    }

    public boolean turnON(){
        return true;
    }

    public boolean turnOFF(){
        return false;
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
