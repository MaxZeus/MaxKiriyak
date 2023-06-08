package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;

        try (SeekableByteChannel fChan = Files.newByteChannel(Path.of("file2.txt"))) {

            byte[] array = new byte[89];
            ByteBuffer buf = ByteBuffer.wrap(array);

            do {
                count = fChan.read(buf);
                if (count != -1) {
                    buf.rewind();
                    for (byte b : array) System.out.print((char) b);
                }
            } while (count != -1);
            System.out.println();
        } catch (InvalidPathException | IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
