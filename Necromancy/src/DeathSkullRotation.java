package src;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.util.AbstractMap.SimpleEntry;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeathSkullRotation implements NativeKeyListener {
   private static int rotationTimes = 0;

    private static volatile boolean isRunning = false;

    public static void main(String[] args) {
        try {
            // Set up the global key listener
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new DeathSkullRotation());

            executeRobotTasks();
        } catch (NativeHookException e) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (AWTException e) {
            System.err.println("There was a problem with AWT Robot.");
            System.err.println(e.getMessage());
            System.exit(1);
        } finally {
            // Clean up the native hook.
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException e) {
                System.err.println("There was a problem unregistering the native hook.");
                System.err.println(e.getMessage());
            }
        }
    }

    private static void executeRobotTasks() throws AWTException {

        List<Map.Entry<Integer, Integer[]>> keyEvents = new ArrayList<>();
        int baseDelay = 475;
        Integer[] delays = new Integer[]{baseDelay + (int) (Math.random() * 26.0), baseDelay + (int) (Math.random() * 26.0), baseDelay + (int) (Math.random() * 26.0), baseDelay + (int) (Math.random() * 26.0)};

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

            while (true) {
                if (isRunning) {
                    for (Map.Entry<Integer, Integer[]> keyEvent : keyEvents) {
                        for (int delay : keyEvent.getValue()) {
                            robot.keyPress(keyEvent.getKey());
                            robot.keyRelease(keyEvent.getKey());
                            try {
                                Thread.sleep(delay);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                        rotationTimes++;
                    }
                    if (rotationTimes >= 20) {
                        rotationTimes = 0;
                    }
                }
            }
        }


    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_F2) {
            if (isRunning) {
                isRunning = false;
            } else {
                isRunning = true;
                rotationTimes = 0;
            }
        }

    }
    public void nativeKeyReleased(NativeKeyEvent e) {
        // Interface requirements
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
        // Interface requirements
    }
}
