package Actividad_3_4_Interfaces;

public class Impresora implements Imprimible, Borrable {
    String pagina;

    Impresora() {
        pagina = TEXTO_POR_DEFECTO;
    }
    
    @Override
    public void imprime() {
        System.out.println(pagina);
    }
    public void establecerContenido(String content) {
        pagina = content;
    }
}
