package passwordgeneratorv2;
import java.util.Scanner;
import java.util.Random;
public class PasswordGeneratorV2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        String[] rakamlar={"1","2","3","4","5","6","7","8","9","0"};
        String[] kucukharfler={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","n","o","p","r","s","t","u","v","y","z","x","w"};
        String[] buyukharfler={"A","B","C","D","E","F","G","H","I","J","K","L","M","M","N","O","P","R","S","T","U","V","Y","Z","X","W"};
        String[] semboller={"!","'","#","+","%","&","/","(",")","=","-","_","?"};
        System.out.println("Sifrede hangi karakterlerin kullanilmasini istersiniz?");
        System.out.println("Kucuk harfler:k buyuk harfler:b rakamlar:r semboller:s)");
        System.out.println("(Birden fazla karakter cesidi icin istediginiz karakter cesidini yan yana yazin. Orn: kb(kucuk ve buyuk harfler))");
        String durum=input.nextLine();
        durum=durum.toLowerCase();
        System.out.println("Sifre uzunlugu giriniz: ");
        int uzunluk=input.nextInt();
        String sifre="";
        if(durum.equals("r")){
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(rakamlar.length);
                sifre+=rakamlar[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("k")){
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(kucukharfler.length);
                sifre+=kucukharfler[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("b")){
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(buyukharfler.length);
                sifre+=buyukharfler[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("s")){
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(semboller.length);
                sifre+=semboller[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("kr")||durum.equals("rk")){
            String[] kharfrakam=new String[rakamlar.length+kucukharfler.length];
            System.arraycopy(kucukharfler, 0, kharfrakam, 0, kucukharfler.length);
            System.arraycopy(rakamlar,0,kharfrakam,kucukharfler.length,rakamlar.length);
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(kharfrakam.length);
                sifre+=kharfrakam[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("rb")||durum.equals("br")){
            String[] bharfrakam=new String[rakamlar.length+buyukharfler.length];
            System.arraycopy(buyukharfler, 0, bharfrakam, 0, buyukharfler.length);
            System.arraycopy(rakamlar,0,bharfrakam,buyukharfler.length,rakamlar.length);
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(bharfrakam.length);
                sifre+=bharfrakam[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("rs")||durum.equals("sr")){
            String[] kharfrakam=new String[rakamlar.length+semboller.length];
            System.arraycopy(semboller, 0, kharfrakam, 0, semboller.length);
            System.arraycopy(rakamlar,0,kharfrakam,semboller.length,rakamlar.length);
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(kharfrakam.length);
                sifre+=kharfrakam[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("kb")||durum.equals("bk")){
            String[] buyukkucuk=new String[buyukharfler.length+kucukharfler.length];
            System.arraycopy(kucukharfler, 0, buyukkucuk, 0, buyukharfler.length);
            System.arraycopy(buyukharfler,0,buyukkucuk,kucukharfler.length,buyukharfler.length);
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(buyukkucuk.length);
                sifre+=buyukkucuk[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("ks")||durum.equals("sk")){
            String[] kharfsembol=new String[semboller.length+kucukharfler.length];
            System.arraycopy(kucukharfler, 0, kharfsembol, 0, kucukharfler.length);
            System.arraycopy(semboller,0,kharfsembol,kucukharfler.length,semboller.length);
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(kharfsembol.length);
                sifre+=kharfsembol[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("bs")||durum.equals("sb")){
            String[] bharfsembol=new String[semboller.length+buyukharfler.length];
            System.arraycopy(buyukharfler, 0, bharfsembol, 0, buyukharfler.length);
            System.arraycopy(semboller,0,bharfsembol,buyukharfler.length,semboller.length);
            for(int i=0;i<uzunluk;i++){
                int rastgeleindeks=random.nextInt(bharfsembol.length);
                sifre+=bharfsembol[rastgeleindeks];
            }
            System.out.println("Sifre: "+sifre);
        }
        else if(durum.equals("bkr")||durum.equals("brk")||durum.equals("kbr")||durum.equals("krb")
                ||durum.equals("rkb")||durum.equals("rbk")){
            String[] buyukkucukrakam=new String[rakamlar.length+buyukharfler.length+kucukharfler.length];
                System.arraycopy(rakamlar,0,buyukkucukrakam,0,rakamlar.length);
                System.arraycopy(kucukharfler,0,buyukkucukrakam,rakamlar.length,kucukharfler.length);
                System.arraycopy(buyukharfler,0,buyukkucukrakam,rakamlar.length+kucukharfler.length,buyukharfler.length);
                for(int i=0;i<uzunluk;i++){
                    int rastgeleindeks=random.nextInt(buyukkucukrakam.length);
                    sifre=sifre+buyukkucukrakam[rastgeleindeks];
                }
                System.out.println("Sifreniz: "+sifre);
        }
        else if(durum.equals("bks")||durum.equals("bsk")||durum.equals("kbs")||durum.equals("ksb")||
                durum.equals("sbk")||durum.equals("skb")){
            String[] buyukkucuksembol=new String[semboller.length+buyukharfler.length+kucukharfler.length];
                System.arraycopy(semboller,0,buyukkucuksembol,0,semboller.length);
                System.arraycopy(kucukharfler,0,buyukkucuksembol,semboller.length,kucukharfler.length);
                System.arraycopy(buyukharfler,0,buyukkucuksembol,semboller.length+kucukharfler.length,buyukharfler.length);
                for(int i=0;i<uzunluk;i++){
                    int rastgeleindeks=random.nextInt(buyukkucuksembol.length);
                    sifre=sifre+buyukkucuksembol[rastgeleindeks];
                }
                System.out.println("Sifreniz: "+sifre);
        }
        else if(durum.equals("brs")||durum.equals("bsr")||durum.equals("sbr")||durum.equals("srb")||
                durum.equals("rbs")||durum.equals("rsb")){
            String[] buyukrakamsembol=new String[semboller.length+buyukharfler.length+rakamlar.length];
                System.arraycopy(semboller,0,buyukrakamsembol,0,semboller.length);
                System.arraycopy(rakamlar,0,buyukrakamsembol,semboller.length,rakamlar.length);
                System.arraycopy(buyukharfler,0,buyukrakamsembol,semboller.length+rakamlar.length,buyukharfler.length);
                for(int i=0;i<uzunluk;i++){
                    int rastgeleindeks=random.nextInt(buyukrakamsembol.length);
                    sifre=sifre+buyukrakamsembol[rastgeleindeks];
                }
                System.out.println("Sifreniz: "+sifre);
        }
        else if(durum.equals("ksr")||durum.equals("krs")||durum.equals("rks")||durum.equals("rsk")||
                durum.equals("skr")||durum.equals("srk")){
            String[] kucukrakamsembol=new String[semboller.length+rakamlar.length+kucukharfler.length];
                System.arraycopy(semboller,0,kucukrakamsembol,0,semboller.length);
                System.arraycopy(kucukharfler,0,kucukrakamsembol,semboller.length,kucukharfler.length);
                System.arraycopy(rakamlar,0,kucukrakamsembol,semboller.length+kucukharfler.length,rakamlar.length);
                for(int i=0;i<uzunluk;i++){
                    int rastgeleindeks=random.nextInt(kucukrakamsembol.length);
                    sifre=sifre+kucukrakamsembol[rastgeleindeks];
                }
                System.out.println("Sifreniz: "+sifre);
        }
        else if(durum.equals("bksr")||durum.equals("bkrs")||durum.equals("brsk")||durum.equals("brks")||durum.equals("bskr")||durum.equals("bsrk")||
                durum.equals("bksr")||durum.equals("bksr")||durum.equals("kbsr")||durum.equals("kbrs")||durum.equals("krbs")||durum.equals("krsb")||
                durum.equals("sbkr")||durum.equals("sbrk")||durum.equals("skbr")||durum.equals("skrb")||durum.equals("srkb")||durum.equals("srbk")||
                durum.equals("rkbs")||durum.equals("rksb")|| durum.equals("rsbk")||durum.equals("rskb")||durum.equals("rbks")||durum.equals("rbsk")){
            String[] tumu=new String[buyukharfler.length+kucukharfler.length+semboller.length+rakamlar.length];
                System.arraycopy(buyukharfler,0,tumu,0,buyukharfler.length);
                System.arraycopy(kucukharfler,0,tumu,buyukharfler.length,kucukharfler.length);
                System.arraycopy(rakamlar,0,tumu,kucukharfler.length+buyukharfler.length,rakamlar.length);
                System.arraycopy(semboller,0,tumu,kucukharfler.length+buyukharfler.length+rakamlar.length,semboller.length);
                for(int i=0;i<uzunluk;i++){
                    int rastgeleindeks=random.nextInt(tumu.length);
                    sifre=sifre+tumu[rastgeleindeks];
                }
                System.out.println("Sifreniz: "+sifre);
        }
        else{
            System.out.println("Gecersiz karakter istegi.");
        }
    }
}