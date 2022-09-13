/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idiomadosistema;

import java.util.Locale;

/**
 *
 * @author manoela.araujo
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
     
    }
}
