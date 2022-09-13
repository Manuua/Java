/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author manoela.araujo
 */
public class ResolucaoDaTela {

    public static void main(String[] args) {
       Toolkit tela = Toolkit.getDefaultToolkit();
       Dimension d = tela.getScreenSize();
        System.out.println("A resolução da tela é :" + d.width + "x" + d.height);
       
    }
}
//