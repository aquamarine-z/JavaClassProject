package player;

import java.io.File;

public class MP3Decoder implements Decoder{
    @Override
    public boolean canDecode(String path) {
        return path.matches("\\.mp3$");
    }

    @Override
    public String decode(String path) {
        return "MP3";
    }
}
