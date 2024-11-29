/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author compu
 */
public class Temporada {

    public Temporada() throws ParseException {
        this.fechaIncio = sdf.parse("28/11");
        this.fechaFin = sdf.parse("20/03");
        
    }

    /**
     * @return the fechaIncio
     */
    public Date getFechaIncio() {
        return fechaIncio;
    }

    /**
     * @param fechaIncio the fechaIncio to set
     */
    public void setFechaIncio(Date fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
    
    private Date fecha = new Date();
    private Date fechaIncio;
    private Date fechaFin;
}
