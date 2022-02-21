package interfaces;

public interface Message {
    public default String getText(String m) {
        return "M:" + m;
    }
}
