package model;

import java.util.List;

public class Dependente {
    private Long cartao_dep;
    private String nom_dep;
    private String parentesco;
    private String email_dep;

    private List<Socio> socios;

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

    //reg_dep(): long;
}
