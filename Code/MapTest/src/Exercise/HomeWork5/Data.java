package Exercise.HomeWork5;

public class Data {
    private float accessTime;

    private float phoneNum;

    private String macAdress;

    private String ipAdress;

    private String domainName;

    private String webSite;

    private int up;

    private int down;

    private int status;

    public Data(float accessTime, float phoneNum, String macAdress, String ipAdress, String domainName, String webSite, int up, int down, int status) {
        this.accessTime = accessTime;
        this.phoneNum = phoneNum;
        this.macAdress = macAdress;
        this.ipAdress = ipAdress;
        this.domainName = domainName;
        this.webSite = webSite;
        this.up = up;
        this.down = down;
        this.status = status;
    }

    public float getAccessTime() {
        return accessTime;
    }

    public float getPhoneNum() {
        return phoneNum;
    }

    public String getMacAdress() {
        return macAdress;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getWebSite() {
        return webSite;
    }

    public int getUp() {
        return up;
    }

    public int getDown() {
        return down;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Data{" +
                "accessTime=" + accessTime +
                ", phoneNum=" + phoneNum +
                ", macAdress='" + macAdress + '\'' +
                ", ipAdress='" + ipAdress + '\'' +
                ", domainName='" + domainName + '\'' +
                ", webSite='" + webSite + '\'' +
                ", up=" + up +
                ", down=" + down +
                ", status=" + status +
                '}';
    }
}
