package homework.decisions;

public class LightColorDetector {
    public static String detect(int wavelength) {
        String color = "Invisible light";
        if (wavelength >= 380 && wavelength <= 449)
            color = "Violet";
        if (wavelength >= 450 && wavelength <= 494)
            color = "Blue";
        if (wavelength >= 495 && wavelength <= 569)
            color = "Green";
        if (wavelength >= 570 && wavelength <= 589)
            color = "Yellow";
        if (wavelength >= 590 && wavelength <= 619)
            color = "Orange";
        if (wavelength >= 620 && wavelength <= 750)
            color = "Red";
        return color;
    }
}
