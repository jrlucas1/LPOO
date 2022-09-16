package model;

public class Dependente {
    private Long cartao_dep;
    private String nom_dep;
    private String parentesco;
    private String email_dep;

   private long socio;

    public Long getCartao_dep() {
        return cartao_dep;
    }

    public void setCartao_dep(Long cartao_dep) {
        this.cartao_dep = cartao_dep;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEmail_dep() {
        return email_dep;
    }

    public void setEmail_dep(String email_dep) {
        this.email_dep = email_dep;
    }

    public long getSocio() {
        return socio;
    }

    public void setSocio(long socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "cartao_dep=" + cartao_dep +
                ", nom_dep='" + nom_dep + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", email_dep='" + email_dep + '\'' +
                ", socio=" + socio +
                '}';
    }

    //reg_dep(): long;
}
