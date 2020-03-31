import javax.swing.*;
import java.util.Scanner;

public class romanArabicConverter {

    public static void main(String[] args) {
        units();
        withsubstractions();
    }
    public static void units(){
        int anum=463;
        int M=anum/1000;
        int C=(anum-M*1000)/100;
        int X=((anum-M*1000)-C*100)/10;
        int U= anum-(M*1000+C*100+X*10);
        String rnum="";
        while (M>0){
            rnum+="M";
            M-=1;
        }
        if(C==9){
            rnum+="CM";
        }else if(C>=5) {
            rnum+="D";
            while (C>5){
                rnum+="C";
                C-=1;
            }}else if(C<=3){
            while (C>0){
                rnum+="C";
                C-=1;
            }
        }else{
            rnum+="CD";
        }
        if(X==9){
            rnum+="XC";
        }else if(X>=5) {
            rnum+="L";
            while (X>5){
                rnum+="X";
                X-=1;
            }}else if(X<=3){
            while (X>0){
                rnum+="X";
                X-=1;
            }
        }else{
            rnum+="XL";
        }
        if(U==9){
            rnum+="IX";
        }else if(U>=5) {
            rnum+="V";
            while (U>5){
                rnum+="I";
                U-=1;
            }}else if(U<=3){
            while (U>0){
                rnum+="I";
                U-=1;
            }
        }else{
            rnum+="IV";
        }

        System.out.println(M+","+C+","+X+","+U);
        System.out.println(rnum+"");

    }
    public static void withsubstractions(){
        int anum=463;
        String rnum = "";
        while (anum>=1000) {
            rnum += "M";
            anum -= 1000;
        }
        if (anum>=900){
            rnum+="CM";
            anum-=900;
        } else if (anum>=800){
            rnum+="DCCC";
            anum-=800;
        } else if (anum>=700){
            rnum+="DCC";
            anum-=700;
        }else if (anum>=600){
            rnum+="DC";
            anum-=600;
        }else if (anum>=500){
            rnum+="D";
            anum-=500;
        }
        if (anum>=400){
            rnum+="CD";
            anum-=400;
        }
        else if (anum>=300){
            rnum+="CCC";
            anum-=300;
        }
        else if (anum>=200){
            rnum+="CC";
            anum-=200;
        }
        else if (anum>=100){
            rnum+="C";
            anum-=100;
        }
        if (anum>=90){
            rnum+="XC";
            anum-=90;
        } else if (anum>=80){
            rnum+="LXXX";
            anum-=80;
        } else if (anum>=70){
            rnum+="LXX";
            anum-=70;
        }else if (anum>=60){
            rnum+="LX";
            anum-=60;
        }else if (anum>=50){
            rnum+="L";
            anum-=50;
        }else if (anum>=40){
            rnum+="XL";
            anum-=40;
        } else if (anum>=30){
            rnum+="XXX";
            anum-=30;
        }else if (anum>=20){
            rnum+="XX";
            anum-=20;
        }else if (anum>=10){
            rnum+="X";
            anum-=10;
        }
        if (anum==9){
            rnum+="IX";
        }else if (anum==8){
            rnum+="VIII";
        }else if (anum==7){
            rnum+="VII";
        }else if (anum==6){
            rnum+="VI";
        }else if (anum==5){
            rnum+="V";
        }else if (anum==4){
            rnum+="IV";
        }else if (anum==3){
            rnum+="III";
        }else if (anum==2){
            rnum+="II";
        }else{
            rnum+="I";
        }
        System.out.println(rnum);
        System.out.println(anum);
    }
}
