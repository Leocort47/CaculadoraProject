public class Empresa {
    // Atrtibutos
    private boolean adquiere;
    private String producto;
    private float dinero;
    private String material;
    private Boolean gana;
    private String facilidad;
    private String consumir;

    // Metodos
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
    }

    public boolean isAdquiere() {
        return adquiere;
    }

    public void setAdquiere(boolean adquiere) {
        this.adquiere = adquiere;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Empresa(Boolean gana, String facilidad, String consumir) {
        this.gana = gana;
        this.facilidad = facilidad;
        this.consumir = consumir;
    }

    public class Vendedor {

        // Atributos
        private Boolean gana;
        private String facilidad;
        private String consumir;

        public Vendedor(Boolean gana, String facilidad, String consumir) {
            this.gana = gana;
            this.facilidad = facilidad;
            this.consumir = consumir;
        }

        public class Persona {

            public String getAdquiere() {
                return adquiere;
            }

            public void setAdquiere(String adquiere) {
                this.adquiere = adquiere;
            }

            public String getProducto() {
                return producto;
            }

            public void setProducto(String producto) {
                this.producto = producto;
            }

            public Integer getDinero() {
                return dinero;
            }

            public void setDinero(Integer dinero) {
                this.dinero = dinero;
            }

            public Integer getSalario() {
                return salario;
            }

            public void setSalario(Integer salario) {
                this.salario = salario;
            }

            private String adquiere;
            private String producto;
            private Integer dinero;
            private Integer salario;

        }

    }

}