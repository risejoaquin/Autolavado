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
    public Date getfecha1() {
        return fecha1;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setfecha1(Date fecha) {
        this.fecha1 = fecha;
    }
    
    SimpleDateFormat _df = new SimpleDateFormat("dd/MM/yyyy");
    
     public Temporada() throws ParseException {
        this.fechaIncio = _df.parse("28/11/2024");
        this.fechaFin = _df.parse("20/03/2025");
        
    }
    
    private static Date fecha1 = new Date();
    private Date fechaIncio;
    private Date fechaFin;
}
