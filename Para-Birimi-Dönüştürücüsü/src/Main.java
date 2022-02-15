import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double amount, dollar, pound, code, euro, yen, ringgit, rupee;
        DecimalFormat f =new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Para Dönüştürücüye Hoşgeldiniz");
        System.out.println("Hangi Para Birimini Dönüştürmek İstersiniz?");
        System.out.println("1:RUPPE /t2:DOLLAR /t3:EURO /t4:POUND /t5:YEN /t6:RINGGIT");
        code = sc.nextInt();
        System.out.println("Ne Kadar Para Dönüştüreceksiniz");
        amount = sc.nextFloat();

        if (code==1){

            dollar = amount/70;
            System.out.println("Senin "+amount +" Rupee'n: "+f.format(dollar)+" Dollar");

            euro = amount/75;
            System.out.println("Senin "+amount +" Rupee'n: "+f.format(euro)+" Euro");

            pound = amount/85;
            System.out.println("Senin "+amount +" Rupee'n: "+f.format(pound)+" Pound");

            yen = amount/2;
            System.out.println("Senin "+amount +" Rupee'n: "+f.format(yen)+" Yen");

            ringgit = amount/12;
            System.out.println("Senin "+amount +" Rupee'n: "+f.format(ringgit)+" Riggit");

        }else if (code==2){
            rupee = amount * 70;
            System.out.println("Senin "+amount+" Dolar'ın: "+f.format(rupee)+" Rupee");

            pound = amount * 0.78;
            System.out.println("Senin "+amount+" Dolar'ın: "+f.format(pound)+" Pound");

            euro = amount * 0.90;
            System.out.println("Senin "+amount+" Dolar'ın: "+f.format(euro)+" Euro");

            yen = amount*110;
            System.out.println("Senin "+amount+" Dolar'ın: "+f.format(yen)+" Yen");

            ringgit = amount*17;
            System.out.println("Senin "+amount+" Dolar'ın: "+f.format(ringgit)+" Ringgit");

        }else if (code == 3){
            pound=amount * 0.82;
            System.out.println("Senin "+amount+" Euro'n: "+f.format(pound)+" Pound");

            dollar = amount * 1.1;
            System.out.println("Senin "+amount+" Euro'n: "+f.format(dollar)+" Dolar");

            ringgit = amount *25;
            System.out.println("Senin "+amount+" Euro'n: "+f.format(ringgit)+" Ringgit");

            yen = amount * 95;
            System.out.println("Senin "+amount+" Euro'n: "+f.format(yen)+" Yen");

            rupee = amount * 57;
            System.out.println("Senin "+amount+" Euro'n: "+f.format(rupee)+" Rupee");

        }else if (code == 4) {
            euro = amount * 0.80;
            System.out.println("Senin " + amount + " Pound'un: " + f.format(euro) + " Euro");

            dollar = amount * 0.86;
            System.out.println("Senin " + amount + " Pound'un: " + f.format(dollar) + " Dolar");

            rupee = amount * 122;
            System.out.println("Senin " + amount + " Pound'un: " + f.format(rupee) + " Rupee");

            ringgit = amount * 94;
            System.out.println("Senin " + amount + " Pound'un: " + f.format(ringgit) + " Ringgit");

            yen = amount * 158;
            System.out.println("Senin " + amount + " Pound'un: " + f.format(yen) + " Yen");
        }else if (code == 5) {

            euro = amount /80;
            System.out.println("senin "+amount+" yen'in: "+f.format(euro)+ " Euro");

            pound = amount /125;
            System.out.println("senin "+amount+" yen'in: "+f.format(pound)+" Pound");

            dollar = amount/68;
            System.out.println("senin "+amount+" yen'in: "+f.format(dollar)+" Dolar");

            rupee = amount/0.2;
            System.out.println("senin"+amount+" yen'in: "+f.format(rupee)+" Rupee");

            ringgit = amount/0.4;
            System.out.println("senin"+amount+" yen'in: "+f.format(ringgit)+" Ringgit");
        }else if (code==6) {

            pound = amount / 64;
            System.out.println("Senin" + amount + "Ringgit: " + f.format(pound) + " Pound");

            euro = amount / 54;
            System.out.println("senin" + amount + "ringgit: " + f.format(euro) + " Euro");

            dollar = amount / 45;
            System.out.println("senin" + amount + "ringgit: " + f.format(dollar) + " Dolar");

            yen = amount / 1.2;
            System.out.println("senin" + amount + "ringgit: " + f.format(yen) + " Yen");

            rupee = amount / 1.4;
            System.out.println("senin" + amount + "ringgit: " + f.format(rupee) + " Rupee");

        }else {
            System.out.println("geçersiz girdi");
        }
        System.out.println("Sistemimizi Kullandıgınız İçin Teşekkür Ederiz. ");
        }
}