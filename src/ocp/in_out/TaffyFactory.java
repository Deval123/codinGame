package ocp.in_out;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author $ Devalère
 **/
public class TaffyFactory {
    public int getPrize(byte[] luck) throws Exception {
        try (InputStream is = new ByteArrayInputStream(luck)) {
            is.read(new byte[2]);
            if (!is.markSupported()) return -1;
            is.mark(5);
            is.read(); is.read();
            is.skip(3);
            is.reset();
            return is.read();
        }
    }
    public static void main(String[] sticky) throws Exception {
        final TaffyFactory p = new TaffyFactory();
        final var luck = new byte[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print(p.getPrize(luck));
    } }
