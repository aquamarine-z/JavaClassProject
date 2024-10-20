package player;

public class WAVDecoder implements Decoder{
    @Override
    public boolean canDecode(String path) {
        return path.matches("\\.wav$");
    }

    @Override
    public String decode(String path) {
        return "WAV";
    }
}
