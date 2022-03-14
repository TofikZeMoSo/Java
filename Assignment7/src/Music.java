public class Music {

    void singMusic() {
        System.out.println("I am outer class Music");
    }

    class Classical {
        Classical(String musicType) {
            System.out.println("I am singer of :"+ musicType);
        }
    }
}

class Singer extends Music {

    void aboutSinger() {
        System.out.println("I am a Singer");
    }

    class SingerDescription extends Music.Classical {

        SingerDescription(String musicType) {
            super(musicType);
        }
    }
}

class MusicMain {
    public static void main(String[] args) {
        Music Mu = new Music();
        Music.Classical classical = Mu.new Classical("Classical Music");
    }
}