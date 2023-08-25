/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ce1103.chatservice;
import java.util.ArrayList;
/**
 *
 * @author monge
 */
public class ChatService {

    public static ArrayList<Integer> puertos = new ArrayList<Integer>();
    public static void main(String[] args) {
        String hola = "Que pasa?503675";
        char lenPuertoChar = hola.charAt(hola.length()-1);
        Integer lenPuertoInt = Character.getNumericValue(lenPuertoChar);
        Integer finPuerto = hola.length()-1;
        Integer inicioPuerto = finPuerto - lenPuertoInt;
        String strPuerto = hola.substring(inicioPuerto, finPuerto);
        String strMensaje = hola.substring(0, inicioPuerto);
        System.out.println(strMensaje + "para puerto: " + strPuerto);

        puertos.add(5023);
        puertos.add(5379);
        System.out.println(puertos);
    }
}
