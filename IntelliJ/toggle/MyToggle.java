package toggle;

public class MyToggle {
    private boolean isOn;


    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        this.isOn  = !isOn;
    }

}
