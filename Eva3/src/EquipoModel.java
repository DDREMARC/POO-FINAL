public abstract class EquipoModel {
    protected String codigo;
    protected String descripcion;
    protected float tarifa;
    private boolean estado;
    protected int dias;

    public EquipoModel(String codigo, String descripcion, float tarifa, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getTarifa() {
        return tarifa;
    }
    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public int getDias() {return dias;}
    public void setDias(int dias) {this.dias = dias;}

    public abstract void TarifaPorDia(float tarifa);
}
