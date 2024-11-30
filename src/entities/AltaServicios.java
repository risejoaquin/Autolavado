/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author compu
 */
public class AltaServicios {

    /**
     * @return the limpiezaVidrios
     */
    public static int getLimpiezaVidrios() {
        return limpiezaVidrios;
    }

    /**
     * @param aLimpiezaVidrios the limpiezaVidrios to set
     */
    public static void setLimpiezaVidrios(int aLimpiezaVidrios) {
        limpiezaVidrios = aLimpiezaVidrios;
    }

    /**
     * @return the encerado
     */
    public static int getEncerado() {
        return encerado;
    }

    /**
     * @param aEncerado the encerado to set
     */
    public static void setEncerado(int aEncerado) {
        encerado = aEncerado;
    }

    /**
     * @return the pulido
     */
    public static int getPulido() {
        return pulido;
    }

    /**
     * @param aPulido the pulido to set
     */
    public static void setPulido(int aPulido) {
        pulido = aPulido;
    }

    /**
     * @return the lavadoExterior
     */
    public static int getLavadoExterior() {
        return lavadoExterior;
    }

    /**
     * @param aLavadoExterior the lavadoExterior to set
     */
    public static void setLavadoExterior(int aLavadoExterior) {
        lavadoExterior = aLavadoExterior;
    }

    /**
     * @return the lavadoInterior
     */
    public static int getLavadoInterior() {
        return lavadoInterior;
    }

    /**
     * @param aLavadoInterior the lavadoInterior to set
     */
    public static void setLavadoInterior(int aLavadoInterior) {
        lavadoInterior = aLavadoInterior;
    }

    /**
     * @return the aspirado
     */
    public static int getAspirado() {
        return aspirado;
    }

    /**
     * @param aAspirado the aspirado to set
     */
    public static void setAspirado(int aAspirado) {
        aspirado = aAspirado;
    }

    /**
     * @return the servicioCompleto
     */
    public static int getServicioCompleto() {
        return servicioCompleto;
    }

    /**
     * @param aServicioCompleto the servicioCompleto to set
     */
    public static void setServicioCompleto(int aServicioCompleto) {
        servicioCompleto = aServicioCompleto;
    }
    
    private static int limpiezaVidrios = 0;
    private static int encerado = 0;
    private static int pulido = 0;
    private static int lavadoExterior = 0;
    private static int lavadoInterior = 0;
    private static int aspirado= 0;
    private static int servicioCompleto = 0;
}
