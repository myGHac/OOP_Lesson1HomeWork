package task4;

import task4.Computer;

public class Main {

public static void computers() {

    Computer [] computers = new Computer[5];

    computers[0] = new Computer();
    computers[1] = new Computer();
    computers[2] = new Computer();
    computers[3] = new Computer();
    computers[4] = new Computer();

    computers[0].cpuName ="Intel core i3 ";
    computers[0].sysBoard ="Asus P8H61-M";
    computers[0].ramVolume = "8 Gb";
    computers[0].hdVolume =" 500 Gb ";

    computers[1].cpuName = "Intel core i5 ";
    computers[1].sysBoard ="Asus P8H61-M LX2";
    computers[1].ramVolume ="16 Gb";
    computers[1].hdVolume =" 1000 Gb ";

    computers[2].cpuName="Intel core i7 ";
    computers[2].sysBoard ="Asus P8H61-M LE2";
    computers[2].ramVolume = "16 Gb";
    computers[2].hdVolume = " 500 Gb ";

    computers[3].cpuName = "Intel G2020 ";
    computers[3].sysBoard ="Asus P8H68-M";
    computers[3].ramVolume = "4 Gb";
    computers[3].hdVolume = " 1000 Gb ";

    computers[4].cpuName = "Intel G2030 ";
    computers[4].sysBoard = "Asus P8H68-M LE";
    computers[4].ramVolume = "16 Gb";
    computers[4].hdVolume=" 500 Gb ";

    for (int i = 1; i < computers.length; i++) {

        computers[i].setCpuName(computers[i].cpuName);
        computers[i].setSysBoard(computers[i].sysBoard);
        computers[i].setRamVolume(computers[i].ramVolume);
        computers[i].setHdVolume(computers[i].hdVolume);

        System.out.println("Обьект " + i + " записан.");
    }
}

    public static void main(String[] args) {

    computers();

    }
}
