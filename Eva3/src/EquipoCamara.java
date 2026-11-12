public class EquipoCamara extends EquipoModel{
    private float seguroObligatorio;

    public EquipoCamara(String codigo, String descripcion, float tarifa, boolean estado, float seguroObligatorio) {
        super(codigo, descripcion, tarifa, estado);
        this.seguroObligatorio = seguroObligatorio;
    }

    @Override
    public void TarifaPorDia(float tarifaPorDia) {
        float tarifaPorDia = (tarifa * dias) + 0.15f;

    }
}
