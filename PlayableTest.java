interface Playable {
    void play();
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }}
public class PlayableTest {
    public static void main(String[] args) {
        Football fl = new Football();
        Volleyball vl = new Volleyball();
        Basketball bl = new Basketball();
        fl.play();
        vl.play();
        bl.play();
    }}