package instances;

public class IncancesExample {
    public void instancesExample() {
        AbstractFile abstractFile = new MusicFile();
        useInstance(abstractFile);
    }

    private void useInstance(AbstractFile abstractFile) {
        if (abstractFile instanceof MusicFile) {
            ((MusicFile) abstractFile).playMusic();
        }

        if (abstractFile instanceof MusicFile musicFile) {
            musicFile.playMusic();
        }
    }
}
