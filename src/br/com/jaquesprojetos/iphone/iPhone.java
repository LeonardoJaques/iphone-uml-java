package br.com.jaquesprojetos.iphone;


import br.com.jaquesprojetos.iphone.components.InternetCommunicator;
import br.com.jaquesprojetos.iphone.components.MusicPlayer;
import br.com.jaquesprojetos.iphone.components.Phone;

/**
 * Represents an iPhone device with music player, phone, and internet functionalities.
 */
public class iPhone {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.playMusic();
        iphone.makeCall();
        iphone.browseWeb();
    }
    private MusicPlayer musicPlayer;
    private Phone phone;
    private InternetCommunicator internetCommunicator;

    /**
     * Constructs an iPhone object, initializing its music player, phone, and internet communicator components.
     */

    public iPhone() {
        this.musicPlayer = new MusicPlayer();
        this.phone = new Phone();
        this.internetCommunicator = new InternetCommunicator();
    }

    // Music Player Methods

    /**
     * Starts playing music.
     */
    public void playMusic() {
        musicPlayer.playMusic();
    }

    /**
     * Pauses the currently playing music.
     */
    public void pauseMusic() {
        musicPlayer.pauseMusic();
    }

    /**
     * Stops music playback.
     */
    public void stopMusic() {
        musicPlayer.stopMusic();
    }

    /**
     * Allows selection of a specific song.
     */
    public void selectSong() {
        musicPlayer.selectSong();
    }

    /**
     * Adjusts the music volume.
     */
    public void adjustVolume() {
        musicPlayer.adjustVolume();
    }

    // Phone Methods

    /**
     * Initiates a phone call.
     */
    public void makeCall() {
        phone.makeCall();
    }

    /**
     * Answers an incoming phone call.
     */
    public void receiveCall() {
        phone.receiveCall();
    }

    /**
     * Ends the current phone call.
     */
    public void endCall() {
        phone.endCall();
    }

    /**
     * Sends an SMS message.
     */
    public void sendSMS() {
        phone.sendSMS();
    }

    /**
     * Receives an SMS message.
     */
    public void receiveSMS() {
        phone.receiveSMS();
    }

    // Internet Communicator Methods

    /**
     * Opens a web browser for internet browsing.
     */
    public void browseWeb() {
        internetCommunicator.browseWeb();
    }

    /**
     * Sends an email.
     */
    public void sendEmail() {
        internetCommunicator.sendEmail();
    }

    /**
     * Receives an email.
     */
    public void receiveEmail() {
        internetCommunicator.receiveEmail();
    }

    /**
     * Displays map information.
     */
    public void viewMaps() {
        internetCommunicator.viewMaps();
    }
}
