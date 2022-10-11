package uia.com.agendafx.agendafx;


public class Contacto {

    private final String tipo;
    private final String nombre;
    private final String fechaRecordatorio;
    private final String fecha;


    public Contacto(String tipo, String nombre, String fechaRecordatorio, String fecha) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.fechaRecordatorio = fechaRecordatorio;
        this.fecha = fecha;
    }


    public String getNombre() {
        return nombre;
    }

    public String getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String text) {
    }

    public void setNombre(String text) {
    }

    public void setFecha(String text) {
    }

    public void setFechaRecordatorio(String text) {
    }
}
