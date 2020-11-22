package task4;

public class Computer {

  public String cpuName;
  public String sysBoard;
  public String ramVolume;
  public String hdVolume;

   // public  Computer() { };
  //public  Computer(String cpuName, String sysBoard, String ramVolume, String hdVolume) {
   // }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public String getSysBoard() {
        return sysBoard;
    }

    public void setSysBoard(String sysBoard) {
        this.sysBoard = sysBoard;
    }

    public String getRamVolume() {
        return ramVolume;
    }

    public void setRamVolume(String ramVolume) {
        this.ramVolume = ramVolume;
    }

    public String getHdVolume() {
        return hdVolume;
    }

    public void setHdVolume(String hdVolume) {
        this.hdVolume = hdVolume;
    }
}
