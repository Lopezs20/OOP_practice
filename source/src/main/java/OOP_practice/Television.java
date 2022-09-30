package OOP_practice;

import java.util.ArrayList;
import java.sql.Time;
import java.sql.Timestamp;

public class Television{
    private int volume = 0;
    private ArrayList<Integer> channels = new ArrayList<>();
    private Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

    public Television(){}

    public Television(int setVolume, ArrayList<Integer> chnls){
        this.volume = setVolume;
        this.channels = chnls;
    }

    public void printTimeStamp(){
        System.out.println(timeStamp);
    }

    public int getChannelNumber(int channelNumber){
        return channels.get(channelNumber);
    }

}
