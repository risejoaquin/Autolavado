/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author compu
 */
public class VentaGeneral {

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

    /**
     * @return the reporte
     */
    public ReporteVenta getReporte() {
        return reporte;
    }

    /**
     * @param reporte the reporte to set
     */
    public void setReporte(ReporteVenta reporte) {
        this.reporte = reporte;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    private RegistroVenta registro = new RegistroVenta();
    private ReporteVenta reporte = new ReporteVenta();
    private Empresa empresa = new Empresa();
    
    VentaGeneral()
    {
        
    }
}
