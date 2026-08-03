package oops.inheritance;

// ---------------- First Interface ----------------
interface Camera {

    void takePhoto();
}

// ---------------- Second Interface ----------------
interface MusicPlayer {

    void playMusic();
}

// ---------------- Child Class ----------------
public class MultipleInheritanceDemo implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking Photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    // Own method
    public void makeCall() {
        System.out.println("Making Phone Call...");
    }

    public static void main(String[] args) {

        MultipleInheritanceDemo phone = new MultipleInheritanceDemo();

        phone.takePhoto();
        phone.playMusic();
        phone.makeCall();
    }
}