import java.util.Scanner;

class CircleArea {
    Scanner sc = new Scanner(System.in);
    int r, hc, hco;
    double aoc,aoc1, voc, voco;

    void setData() {
        
        System.out.println("Enter radious of the circle");
        r = sc.nextInt();
        System.out.println("r= "+r);
    }

    double calculation() {
        aoc= 3.14 * r * r;
        return (aoc);
    }
}

class CylinderVolume extends CircleArea // pi r^2h
{
    Scanner sc = new Scanner(System.in);

    void cyvo() {
        System.out.println("Enter height of the cylinder: ");
        hc = sc.nextInt();
        calculation();
        voc = aoc * hc;
        System.out.println("The required volume of the Cylinder is: " + voc);
    }
}

class ConeVolume extends CircleArea // 1/3 pi r^2h
{
    Scanner sc = new Scanner(System.in);

    void covo() {
        System.out.println("Enter the hight of the cone: ");
        hco = sc.nextInt();
        calculation();
        voco = aoc * hco;
        System.out.println("The required volume of the cone is: " + voco);
    }

}

public class Area {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 to count volume of Cylinder. \nPress 2 to count volume of Cone");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                CylinderVolume cylvol = new CylinderVolume();
                cylvol.setData();
                cylvol.cyvo();
                break;
             case 2:
                 ConeVolume convol = new ConeVolume();
                 convol.setData();
                 convol.covo();
                 break;
             default:
                 System.out.println("Error in Input");
                 break;
        }
        sc.close();
    }
}