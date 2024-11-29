/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Date;

/**
 *
 * @author compu
 */
public class ReporteVenta {

    /**
     * @return the fecha
     */
    public Temporada getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Temporada fecha) {
        this.fecha = fecha;
    }

  

    /**
     * @return the registro
     */
    public RegistroVenta getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(RegistroVenta registro) {
        this.registro = registro;
    }
    private Temporada fecha = new Temporada();
    private RegistroVenta registro = new RegistroVenta();
    
}
