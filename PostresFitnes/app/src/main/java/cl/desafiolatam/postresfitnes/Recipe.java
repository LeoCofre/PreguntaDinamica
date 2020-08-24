package cl.desafiolatam.postresfitnes;

public class Recipe {
    private String nombre;
    private String ingrediente;
    private String preparacion;
    private String image;
    private String id;
    @Override
    public String toString() {
        return "Recipe{" +
                "nombre='" + nombre + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", image='" + image + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
