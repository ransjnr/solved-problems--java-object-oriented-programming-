
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        if(on = true){
            channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if(on = true){
            volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp(){
        if (on && channel < 120){
            channel = channel + 1;
        }
    }

    public void channelDown(){
        if(on && channel >= 120){
            channel = channel - 1;
        }
    }
    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel = volumeLevel + 1;
        }
    }
    public void volumeDown(){
        if(on && volumeLevel >= 7){
            volumeLevel = volumeLevel - 1;
        }
    }

}
