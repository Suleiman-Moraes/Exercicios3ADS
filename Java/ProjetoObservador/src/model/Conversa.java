package model;
public class Conversa {
    private StringBuffer cuDeCurioso = new StringBuffer("");

    public Conversa() {}
    public Conversa(String intriga) {
        this.cuDeCurioso.append(intriga);
    }
    public Conversa(Conversa cv) {
        this.cuDeCurioso.append(cv.getCuDeCurioso() + "");
    }

    public String getCuDeCurioso() {
        return cuDeCurioso.toString();
    }

    public void setCuDeCurioso(String intriga) {
        this.cuDeCurioso.append("\n").append(intriga);
    }
}
