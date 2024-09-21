package org.example;

import static java.lang.Thread.sleep;

public class Task5 {
    public interface Task {
        void start();
        void stop();
    }

    public class Timer implements Task {
        private int timeRemaining;
        private boolean running;
        private Thread timerThread;

        public Timer(int seconds) {
            this.timeRemaining = seconds;
        }

        @Override
        public void start() {
            running = true;
            timerThread = new Thread(() -> {
                while (timeRemaining > 0 && running) {
                    System.out.println("Осталось времени: " + timeRemaining + " секунд");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                    timeRemaining--;
                }
                if (timeRemaining == 0) {
                    System.out.println("Время вышло!");
                }
            });
            timerThread.start();
        }

        @Override
        public void stop() {
            running = false;
            if (timerThread != null) {
                timerThread.interrupt();
            }
        }
    }

    public void solve() {
        Timer timer = new Timer(10);
        timer.start();

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.stop();
        System.out.println("Таймер остановлен.");
    }
}
