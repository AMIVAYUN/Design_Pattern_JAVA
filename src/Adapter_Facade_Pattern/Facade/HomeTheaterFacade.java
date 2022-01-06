package Adapter_Facade_Pattern.Facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayerdvd;
    private CdPlayercd;
    private Projector projector;
    private TheaterLightslights;
    private Screen screen;
    private PopcornPopperpopper;

    public HomeTheaterFacade(Amplifier a, Tuner t,
                             DvdPlayerd, CdPlayerc, Projector p,
                             Screen s, TheaterLightsl, PopcornPopperpp) {
        this.amp = a;
        this.tuner = t;
        this.dvd = d;
        this.cd = c;
        this.projector = p;
        this.lights = l;
        this.screen = s;
        this.popper = pp;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
        amp.off();
        public void endMovie () {
            System.out.println("Shutting movie theater down..");
            popper.off();
            lights.on();
            screen.up();
            projector.off();
            amp.off();
            dvd.stop();
            dvd.eject();
            dvd.off();
        }
… // 기타메소드
    }
}
