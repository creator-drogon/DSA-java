package dataStructure.stack;

import java.io.File;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

public class deadLock extends Thread {
    Object ob = new Object();

    void handleFile(File file) {

        synchronized (this.ob) {
            while (file.exists()) {
            processFile(file);
            }
        }
    }

    void processFile(File file) {
        synchronized (this.ob) {

            while (true) {


            }
        }


    }
}
