package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        String str = "ava.nio package was introduced in java 1.4. In contrast of java I/O in java NIO the buffer and channel " +
                "oriented data flow for I/O operations is introduced which in result provide faster execution and better performance.\n" +
                "Also NIO API offer selectors which introduces the functionality of listen to multiple channels for IO events " +
                "in asynchronous or non blocking way.In NIO the most time-consuming I/O activities including filling and draining " +
                "of buffers to the operating system which increases in speed.";

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("file4.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(str.length());
            mBuf.put(str.getBytes());
            mBuf.rewind();

            fChan.write(mBuf);

        } catch (InvalidPathException | IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
