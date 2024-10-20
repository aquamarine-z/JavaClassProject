package player;

public interface Decoder {
    public boolean canDecode(String path);
    public String decode(String path);
}
