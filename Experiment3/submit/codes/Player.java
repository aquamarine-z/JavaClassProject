package player;

public class Player {
    private final Decoder[] decoders={new MP3Decoder(),new WAVDecoder()};
    public void play(String path){
        for(var decoder:decoders){
            if(decoder.canDecode(path)){
                System.out.println(decoder.decode(path));
            }
        }
    }
}
