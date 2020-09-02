/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

import java.io.File;

/**
 *
 * @author Pc
 */
public class Analisador {
    
    

    /**
     * @param args the command line arguments
     */
    public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "C:/Users/Pc/Documents/NetBeansProjects/AnalizadorLexico/src/analisador/Lexer.flex";
        generarLexer(path);
    }
}
