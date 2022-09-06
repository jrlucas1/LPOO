package model;

public class Depedente {
    private Long cartao_dep;
    private String nom_dep;
    private String parentesco;
    private String email_dap;

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

    public String getEmail_dap() {
        return email_dap;
    }

    public void setEmail_dap(String email_dap) {
        this.email_dap = email_dap;
    }

    //reg_dep(): long;
}
