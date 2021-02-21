package org.example.multithreading;

/*  SEMAPHORES
/   Types: Counting / Binary
/   1. Track how many resources are free, but not which.
/   2. Trigger for actions (web servers)
/   3. Producer consumer problem: Dijkstra
**/

/*  MUTEX: Mutual Exclusion Objects
/   Race condition problem: Many threads compete for the same resource: variable or method.
/   Binary semaphores can be used as mutexes.
/   A lock is basically a mutex.


Reminder:
static: synchronized(App.class)
non-static: synchronized(this)
**/

/*  Differences
/   Semaphores: Signaling mechanisms. wait(), notify() to indicate acquiring or releasing resource.
                Allow multiple threads to access the finite instance resources.
                The thread blocks ITSELF if no resource is free till the count of the semaphore > 0.
/   Mutex:  Locking mechanism. Processes have to acquire the lock on mutex object to acquire the resource.
            Multiple threads access single shared resource, one thread at a time.
            Thread waits until mutex object is unlocked.
**/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class U_Semaphores {
    // Singleton pattern
    enum Downloader {
        INSTANCE; // Thread safe

        // 3 Threads can download at the same time. In main, 12 are created.
        private Semaphore semaphore = new Semaphore(3, true);

        public void downloadData() {
            try {
                semaphore.acquire();
                download();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }

        private void download() {
            System.out.println("Downloading.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 12; i++) { // I have 12 Threads!
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Downloader.INSTANCE.downloadData();
                }
            });
        }
    }
}
