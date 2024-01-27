import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeathSkullRotation {

    public static void main(String[] args) throws AWTException, InterruptedException {
        int rotationTimes = 0;

        // List of key events and their associated delays
        List<Map.Entry<Integer, Integer>> keyEvents = new ArrayList<>();

        int randomNumber = (int) (Math.random() * 101) + 2000;

        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_3, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_2, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_3, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_5, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_2, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_F1, randomNumber)); //super adrenaline
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_6, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_9, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_9, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_2, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_6, randomNumber));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_9, randomNumber));

        Robot robot = new Robot();

        Thread.sleep(randomNumber);
        // Loops through the List and presses each key, then waits a random amount of time between 2,000 and 2100 MS.
        while (rotationTimes < 20) {
            for (Map.Entry<Integer, Integer> keyEvent : keyEvents) {
                robot.keyPress(keyEvent.getKey());
                robot.keyRelease(keyEvent.getKey());
                Thread.sleep(keyEvent.getValue());
            }
            rotationTimes++;
        }
    }
}
