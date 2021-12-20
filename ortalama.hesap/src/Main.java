}import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner mat=new Scanner(System.in);
        System.out.println("matematik sınav notunu giriniz:");
        int say1=mat.nextInt();
        Scanner java=new Scanner(System.in);
        System.out.println("java sınav notunu giriniz:");
        int say2=java.nextInt();
        Scanner turk=new Scanner(System.in);
        System.out.println("türkçe sınav notunu giriniz:");
        int say3=turk.nextInt();
        Scanner fiz=new Scanner(System.in);
        System.out.println("fizik sınav notunu giriniz:");
        int say4=fiz.nextInt();
        Scanner kim=new Scanner(System.in);
        System.out.println("kimya sınav notunu giriniz:");
        int say5=kim.nextInt();
        Scanner tar=new Scanner(System.in);
        System.out.println("tarih sınav notunu giriniz:");
        int say6=tar.nextInt();
        Scanner muz=new Scanner(System.in);
        System.out.println("müzik sınav notunu giriniz:");
        int say7=muz.nextInt();
        int toplam=(say1+say2+say3+say4+say5+say7+say6);
        int ortalama=(toplam/7);
        System.out.println("not ortalaması:"+ortalama);

        System.out.println(ortalama>=60?"Sınıfı Geçtiniz": "Sınıfta Kaldınız");

    }

