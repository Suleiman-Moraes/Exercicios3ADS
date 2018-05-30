package util;
public class No {
    private Comparable info;
    private No proximoNo;

    public No() {}
    public No(Comparable info, No proximoNo) {
        this.info = info;
        this.proximoNo = proximoNo;
    }

    public Comparable getInfo() {
        return info;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setInfo(Comparable info) {
        this.info = info;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
}
