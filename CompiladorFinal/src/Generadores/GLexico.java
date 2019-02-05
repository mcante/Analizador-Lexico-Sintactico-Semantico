package Generadores;

import java.io.File;

public class GLexico 
{
    public static void main(String[] args) 
    {
        String path="src/compiladorfinal/Lexico.jlex";
        generarLexer(path);
    } 
    
    public static void generarLexer(String path)
    {
        File file=new File(path);
        JFlex.Main.generate(file);
    } 
}
