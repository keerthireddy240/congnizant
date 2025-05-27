// Define the Playable interface
interface Playable {
    void play();
}

// Guitar class implements Playable
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar: strum strum!");
    }
}

// Piano class implements Playable
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano: plink plonk!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Create objects of Guitar and Piano
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call play method on each
        guitar.play();
        piano.play();
    }
}
