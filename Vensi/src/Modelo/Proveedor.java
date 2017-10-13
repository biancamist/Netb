package Modelo;

public class Proveedor  implements java.io.Serializable 
{
     private int id;
     private String razonSocial;
     private String cuit;
     private String direccion;
     private String contacto;
     private boolean estado;
     //private Set pedidos = new HashSet(0);

    public Proveedor() 
    { }
	
    public Proveedor(int id, String razonSocial, String cuit, String contacto) 
    {
        this.id = id;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.contacto = contacto;
    }
    
    public Proveedor(int id, String razonSocial, String cuit, String direccion, String contacto, Boolean estado) 
    {
       this.id = id;
       this.razonSocial = razonSocial;
       this.cuit = cuit;
       this.direccion = direccion;
       this.contacto = contacto;
       this.estado = estado;
       //this.pedidos = pedidos;
    }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }

    public String getRazonSocial() 
    {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) 
    {
        this.razonSocial = razonSocial;
    }
    
    public String getCuit() 
    {
        return this.cuit;
    }    
    public void setCuit(String cuit) 
    {
        this.cuit = cuit;
    }
    
    public String getDireccion() 
    {
        return this.direccion;
    }    
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    
    public String getContacto() 
    {
        return this.contacto;
    }    
    public void setContacto(String contacto) 
    {
        this.contacto = contacto;
    }
    
    public boolean isEstado() 
    {
        return this.estado;
    }    
    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }
    
    /*public Set getPedidos() 
    {
        return this.pedidos;
    }    
    public void setPedidos(Set pedidos) 
    {
        this.pedidos = pedidos;
    }*/
}