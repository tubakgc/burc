import java.util.Scanner;

public class burclar {

    public static void main (String[] args) {

        int month, day;
        String burc = " ";


        Scanner input=new Scanner(System.in);



        System.out.print("doğduğunuz ayı giriniz:");
        month = input.nextInt();

        System.out.print("doğduğunuz günü giriniz:");
        day= input.nextInt();

        if ( month == 1){
            if ( (day>=1) && (day<=31)) {
                if (day<21){

                burc = "oğlak";
                }

            }else {
                burc = "kova";
            }


        }
        if ( month == 2){
            if ( (day>=1) && (day<=31)) {
                if (day<22){

                    burc = "kova";
                }

            }else {
                burc = "balık";
            }


        }
        if ( month == 3){
            if ( (day>=1) && (day<=31)) {
                if (day<20){

                    burc = "balık";
                }

            }else {
                burc = "koç";
            }


        }if ( month == 4){
            if ( (day>=1) && (day<=31)) {
                if (day<21){

                    burc = "koç";
                }

            }else {
                burc = "boğa";
            }


        }if ( month == 5){
            if ( (day>=1) && (day<=31)) {
                if (day<21){

                    burc = "boğa";
                }

            }else {
                burc = "ikizler";
            }


        }if ( month == 6){
            if ( (day>=1) && (day<=31)) {
                if (day<22){

                    burc = "ikizler";
                }

            }else {
                burc = "yengeç";
            }


        }if ( month == 7){
            if ( (day>=1) && (day<=31)) {
                if (day<23){

                    burc = "yengeç";
                }

            }else {
                burc = "aslan";
            }


        }if ( month == 8){
            if ( (day>=1) && (day<=31)) {
                if (day<23){

                    burc = "aslan";
                }

            }else {
                burc = "başak";
            }


        }if ( month == 9){
            if ( (day>=1) && (day<=31)) {
                if (day<23){

                    burc = "başak";
                }

            }else {
                burc = "terazi";
            }


        }if ( month == 10){
            if ( (day>=1) && (day<=31)) {
                if (day<23){

                    burc = "terazi";
                }

            }else {
                burc = "akrep";
            }


        }if ( month == 11){
            if ( (day>=1) && (day<=31)) {
                if (day<21){

                    burc = "akrep";
                }

            }else {
                burc = "yay";
            }


        }if ( month == 12){
            if ( (day>=1) && (day<=31)) {
                if (day<22){

                    burc = "yay";
                }

            }else {
                burc = "oğlak";
            }


        }




        System.out.println("burcunuz:"+burc);




    }
}