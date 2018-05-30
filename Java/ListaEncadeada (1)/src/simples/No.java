package simples;
public class No {
    private int info;
    private No proximoNo;

    public No(int info, No proximoNo) {
        this.info = info;
        this.proximoNo = proximoNo;
    }
    public No() {}

    public int getInfo() {
        return info;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
}
