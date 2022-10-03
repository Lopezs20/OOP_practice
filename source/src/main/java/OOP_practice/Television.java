package OOP_practice;

import java.util.ArrayList;
import java.sql.Time;
import java.sql.Timestamp;

public class Television{
    private int currVolume = 0;
    private ArrayList<Integer> channels = new ArrayList<>();
    private Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
    private boolean power;
    private String name;
    private String model;
    private int year;

    public Television(){}

    public Television(String name, String model, int year, ArrayList<Integer> chnls){
        this.name = name;
        this.model =model;
        this.year = year;
        this.channels = chnls;
    }

    public void printTimeStamp(){
        System.out.println(timeStamp);
    }

    public int getChannelNumber(int channelNumber){
        return channels.get(channelNumber);
    }

    protected void powerON(){
        this.power = true;
        System.out.println("Television has been powered ON.");
    }

    protected void powerOFF(){
        this.power = false;
        System.out.println("Television has been turned OFF.");
    }
    
    protected void volume(int vol){
        if(vol < 0){
            currVolume = 0;
            messageVolume();
        }
        if(vol > 100){
            currVolume = 100;
            messageVolume();
        }
        if(vol < 100 && vol > 0){
            currVolume = vol;
            messageVolume();
        }
    }

    protected void messageVolume(){
        if (currVolume == 0){
            System.out.println("Volume is at 0.");
        }
        else {
            System.out.println("Current volume is at " + currVolume);
        }
    }
}
