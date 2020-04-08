/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkvadratnoeuravnenia;

/**
 *
 * @author vi
 */
import java.util.Scanner;
/**
 *
 * @author manyrus
 */
public class TestKvadratnoeUravnenia {
    private static Scanner sc = new Scanner(System.in);
    public static final String hello = "Квадратные уравнения вида ax^2+bx+c.\n"+
            "Введите переменные:";
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double a,b,c,D,x1,x2;
        String out;
        System.out.println(hello);
        a = out("a");
        b = out("b");
        c = out("c");
        out = ("Решения:\n");
        D = Math.pow(b,2) - 4*a*c;
        if(D<0) {
            out += "Т.к. дискриминант("+D+")<0, то корней нет."+
                    "\nОтвет: корней нет.";
        } else {
            x1 = (-b-Math.sqrt(D))/2*a;
            x2 = (-b+Math.sqrt(D))/2*a;
            out += "Т.к. D("+D+")>0, то x1="+x1+", x2="+x2+"."+
                    "\nОтвет: x1="+x1+", x2="+x2+".";
        }
        System.out.println(out);
    }
 
    private static Double out(String var) {
        System.out.print(var+"=");
        return sc.nextDouble();
    }
 
}
