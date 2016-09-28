
public class Recicladora {
	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String pagina;
	private int zona;
	private boolean papel;
	private boolean plastico;
	private boolean metal;
	private boolean vidrio;
	
	public Recicladora(){
		id = 0;
		nombre = "";
		direccion = "";
		telefono = "";
		pagina = "";
		zona = 0;
		papel = false;
		plastico = false;
		metal = false;
		vidrio = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public boolean isPapel() {
		return papel;
	}
	public void setPapel(boolean papel) {
		this.papel = papel;
	}
	public boolean isPlastico() {
		return plastico;
	}
	public void setPlastico(boolean plastico) {
		this.plastico = plastico;
	}
	public boolean isMetal() {
		return metal;
	}
	public void setMetal(boolean metal) {
		this.metal = metal;
	}
	public boolean isVidrio() {
		return vidrio;
	}
	public void setVidrio(boolean vidrio) {
		this.vidrio = vidrio;
	}

	@Override
	public String toString() {
		return "Recicladora [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", pagina=" + pagina + ", zona=" + zona + ", papel=" + papel + ", plastico=" + plastico + ", metal="
				+ metal + ", vidrio=" + vidrio + "]";
	}
	
	
	
}
