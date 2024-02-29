public class TVDemo {
    public static void main(String[] args) {
        TV Samsung = new TV();
        TV LG = new TV();

        Samsung.setChannel(2);
        Samsung.setVolume(110);
        LG.setChannel(5);
        LG.setVolume(25);

        System.out.println("Current Samsung channel is channel: " + Samsung.channel);
    }
}
