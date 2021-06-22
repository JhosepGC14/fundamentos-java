/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhosep_PC
 */
public class OperatorAritmetics {

    public static void main(String args[]) {

        //OPERADORES ARITMENTICOS
        int a = 3, b = 2;

        int result = a + b;

        System.out.println("result suma = " + result);

        result = a - b;

        System.out.println("result resta = " + result);

        result = a * b;

        System.out.println("result multiplicacion = " + result);

        result = a / b;

        System.out.println("result division = " + result);

        result = a % b;

        System.out.println("result modulo = " + result);

        if (a % 2 == 0) {
            System.out.println("a es par = " + a);
        } else {
            System.out.println("a es impar = " + a);
        }

        // OPERADORES DE ASIGNACION
        //asignacion
        int d = 4, e = 2;
        int f = d + 5 - e;
        System.out.println("f = " + f);

        //asignacion pero de composicion
        d += 1; // d = d + 1
        System.out.println("d+= = " + d);

        d -= 3; // d = d - 3
        System.out.println("d-= = " + d);

        d *= 2; // d = d * 2
        System.out.println("d*= = " + d);

        d /= 2; // d = d / 2
        System.out.println("d/= = " + d);

        d %= 2; // d = d % 2
        System.out.println("d%= = " + d);

        // OPERADORES UNARIOS 
        int g = 3;
        int h = -g;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        boolean j = true;
        boolean k = !j;
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        //incremento 
        //1.- preincremento (simbolo antes de la variable)
        var l = 3;
        var m = ++l; // primero se incrementa la variables y despues usa su valor
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        //2.- postincremento (simbolo despues de la variable)
        var n = 4;
        var o = n++; // primero se utiliza el valor y despues incrementa
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        // lo mismo pasa para el "predecremento y postdecremento"
        // --i y i--

        // OPERADORES DE IGUALDAD Y RELACIONES
        int p = 3;
        int q = 4;

        boolean r = (p == q);

        System.out.println("r = " + r);

        boolean s = p != q;

        System.out.println("s = " + s);

        String cadena = "Hola";
        String cadena2 = "Hola";

        boolean t = cadena == cadena2; // compara referencias de objetos

        System.out.println("t = " + t);

        boolean u = cadena.equals(cadena2); //comparamos el contenido de cadenas

        System.out.println("u = " + u);

        boolean v = p >= q;//mayor  que > o el mayor o igual >=
        System.out.println("v = " + v);

        if (p % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        int edad = 10;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }

    }

}
