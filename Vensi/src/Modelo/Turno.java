package Modelo;

import java.util.Date;
import java.util.List;

public class Turno  implements java.io.Serializable 
{
     private int id;
     //private List<> movimientos; //ACOMODAR
     private Date fechaHoraInicio;
     private Date fechaHoraFin;
     private List<ItemVenta> itemVenta;
     //private Set historials = new HashSet(0);

    public Turno() 
    { }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public List<ItemVenta> getItemVenta() 
    {
        return this.itemVenta;
    }    
    public void setItemVenta(ItemVenta itemVenta) 
    {
        this.itemVenta.add(itemVenta);
    }   
    
    public Date getFechaHoraInicio() 
    {
        return this.fechaHoraInicio;
    }    
    public void setFechaHoraInicio(Date fechaHoraInicio) 
    {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    
    public Date getFechaHoraFin() 
    {
        return this.fechaHoraFin;
    }    
    public void setFechaHoraFin(Date fechaHoraFin) 
    {
        this.fechaHoraFin = fechaHoraFin;
    }
    
    /*public Set getHistorials() 
    {
        return this.historials;
    }    
    public void setHistorials(Set historials) 
    {
        this.historials = historials;
    }*/
}


