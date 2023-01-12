package Actividad_3_4_Interfaces;

public interface Imprimible {
    String TEXTO_POR_DEFECTO = "Página de prueba";
    void imprime();
    void establecerContenido(String content);
}
