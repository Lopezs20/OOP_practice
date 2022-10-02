package OOP_practice;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthInternalFrameUI;

import java.sql.Time;
import java.sql.Timestamp;

public class Television{
    private int[] volume = new int[100];
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
    
}
