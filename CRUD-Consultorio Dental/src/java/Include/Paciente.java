/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Include;
/**
 *
 * @author demon
 */
public class Paciente {
    private int id;
    private String nombre;
    private String ap;
    private String am;
    private String sexo;
    private String fechaNac;
    private String domicilio;
    private String tel;
    private int idOcupacion;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String ap, String am, String sexo, String fechaNac, String domicilio, String tel, int idOcupacion) {
        this.id = id;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.tel = tel;
        this.idOcupacion = idOcupacion;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ap
     */
    public String getAp() {
        return ap;
    }

    /**
     * @param ap the ap to set
     */
    public void setAp(String ap) {
        this.ap = ap;
    }

    /**
     * @return the am
     */
    public String getAm() {
        return am;
    }

    /**
     * @param am the am to set
     */
    public void setAm(String am) {
        this.am = am;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fechaNac
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the idOcupacion
     */
    public int getIdOcupacion() {
        return idOcupacion;
    }

    /**
     * @param idOcupacion the idOcupacion to set
     */
    public void setIdOcupacion(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }
    
}
