package src;

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
        List<Map.Entry<Integer, Integer[]>> keyEvents = new ArrayList<>();

        // An Array of delay times to replicate random button spamming.
        // Total delay divided by 4
        int baseDelay = 1900 / 8;

        Integer[] delays = {
                baseDelay + (int) (Math.random() * 13),  // Part of delay, randomized
                baseDelay + (int) (Math.random() * 13),
                baseDelay + (int) (Math.random() * 13),
                baseDelay + (int) (Math.random() * 13),
                baseDelay + (int) (Math.random() * 13),
                baseDelay + (int) (Math.random() * 13),
                baseDelay + (int) (Math.random() * 13),
                baseDelay + (int) (Math.random() * 13),
        };

        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_3, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_2, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_3, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_5, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_2, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_F1, delays)); //super adrenaline
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_6, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_9, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_9, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_2, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_6, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_9, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_1, delays));
        keyEvents.add(new SimpleEntry<>(KeyEvent.VK_4, delays));

        Robot robot = new Robot();

// Loops through the List and presses each key with different delays
        while (rotationTimes < 20) {
            for (Map.Entry<Integer, Integer[]> keyEvent : keyEvents) {
                for (int delay : keyEvent.getValue()) {
                    robot.keyPress(keyEvent.getKey());
                    robot.keyRelease(keyEvent.getKey());
                    Thread.sleep(delay);
                }
            }
            rotationTimes++;
        }

    }
}