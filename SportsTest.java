class Sports {
    public void play() {
        System.out.println("Playing generic sports");
    }}
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football");
    }}
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }}
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }}
public class SportsTest {
    public static void main(String[] args) {
        Sports genericSports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();
        genericSports.play();
        football.play();
        basketball.play();
        rugby.play();
    }}