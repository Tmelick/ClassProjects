/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        12
Exercise:   2.1
ProgramName:TestTV
Purpose:    To print out information using methods from TV
Operation:  When the program is run it calls methods from another class
            and uses the information to print out statements
Input(s):   none
Output(s):  The channel and volume of each tv
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class TestTV {
   public static void main(String[] args) {
      TV tv1 = new TV();
      tv1.turnOn();
      tv1.setChannel(30);
      tv1.setVolume(3);
   
      TV tv2 = new TV();
      tv2.turnOn();
      tv2.channelUp();
      tv2.channelUp();
      tv2.volumeUp();
      
   
      System.out.println("tv1's channel is " + tv1.channel
         + " and volume level is " + tv1.volumeLevel);
      System.out.println("tv2's channel is " + tv2.channel
         + " and volume level is " + tv2.volumeLevel);
         
      TV tv3 = new TV();
      tv3.turnOn();
      System.out.println("\ntv3 is on");
      tv3.setChannel(64);
      System.out.println("tv3 channel is " + tv3.channel);
      tv3.setVolume(2);
      System.out.println("tv3 volume is " + tv3.volumeLevel);
      tv3.volumeUp();
      tv3.volumeUp();
      System.out.println("tv3 volume is " + tv3.volumeLevel);
      tv3.volumeDown();
      System.out.println("tv3 volume is " + tv3.volumeLevel);
      tv3.channelUp();
      tv3.channelUp();
      tv3.channelUp();
      System.out.println("tv3 channel is " + tv3.channel);
      tv3.channelDown();
      System.out.println("tv3 channel is " + tv3.channel);
      tv3.turnOff();
      System.out.println("tv3 is off");
   }
}
class TV {
   int channel = 1; // Default channel is 1
   int volumeLevel = 1; // Default volume level is 1
   boolean on = false; // TV is off

   public TV() {
   }

   public void turnOn() {
      on = true;
   }

   public void turnOff() {
      on = false;
   }

   public void setChannel(int newChannel) {
      if (on && newChannel >= 1 && newChannel <= 120)
         channel = newChannel;
   }

   public void setVolume(int newVolumeLevel) {
      if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
         volumeLevel = newVolumeLevel;
   }

   public void channelUp() {
      if (on && channel < 120)
         channel++;
   }

   public void channelDown() {
      if (on && channel > 1)
         channel--;
   }

   public void volumeUp() {
      if (on && volumeLevel < 7)
         volumeLevel++;
   }

   public void volumeDown() {
      if (on && volumeLevel > 1)
         volumeLevel--;
   }
}