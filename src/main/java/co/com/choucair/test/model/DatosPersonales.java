package co.com.choucair.test.model;

public class DatosPersonales {

    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Mes;
    private String Anio;
    private String Dia;
    private String Ciudad;
    private String Codigo_Postal;
    private String Pais;

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getCodigo_Postal() {
        return Codigo_Postal;
    }

    public void setCodigo_Postal(String codigo_Postal) {
        Codigo_Postal = codigo_Postal;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        this.Mes = mes;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        this.Anio = anio;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        this.Dia = dia;
    }
}
