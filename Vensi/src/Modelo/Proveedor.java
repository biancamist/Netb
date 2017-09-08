package Modelo;
// Generated 07/09/2017 19:19:57 by Hibernate Tools 4.3.1




/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private int id;
     private String nombreCompleto;
     private String cuit;
     private String direccion;
     private String contacto;
     private Boolean estado;
     //private Set pedidos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(int id, String nombreCompleto, String cuit, String contacto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.cuit = cuit;
        this.contacto = contacto;
    }
    public Proveedor(int id, String nombreCompleto, String cuit, String direccion, String contacto, Boolean estado) {
       this.id = id;
       this.nombreCompleto = nombreCompleto;
       this.cuit = cuit;
       this.direccion = direccion;
       this.contacto = contacto;
       this.estado = estado;
       //this.pedidos = pedidos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCuit() {
        return this.cuit;
    }
    
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    /*public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }*/




}

