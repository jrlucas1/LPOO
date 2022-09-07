package model;

import java.util.List;

public class Socio {
    private Long cartao_socio;
    private String nome_socio;
    private String end_socio;
    private String tel_socio;
    private String email_socio;
    private List<Categoria> categorias;
    private List<Mensalidade> mensalidades;

    public Long getCartao_socio() {
        return cartao_socio;
    }

    public void setCartao_socio(Long cartao_socio) {
        this.cartao_socio = cartao_socio;
    }

    public String getNome_socio() {
        return nome_socio;
    }

    public void setNome_socio(String nome_socio) {
        this.nome_socio = nome_socio;
    }

    public String getEnd_socio() {
        return end_socio;
    }

    public void setEnd_socio(String end_socio) {
        this.end_socio = end_socio;
    }

    public String getTel_socio() {
        return tel_socio;
    }

    public void setTel_socio(String tel_socio) {
        this.tel_socio = tel_socio;
    }

    public String getEmail_socio() {
        return email_socio;
    }

    public void setEmail_socio(String email_socio) {
        this.email_socio = email_socio;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "cartao_socio=" + cartao_socio +
                ", nome_socio='" + nome_socio + '\'' +
                ", end_socio='" + end_socio + '\'' +
                ", tel_socio='" + tel_socio + '\'' +
                ", email_socio='" + email_socio + '\'' +
                ", categorias=" + categorias +
                ", mensalidades=" + mensalidades +
                '}';
    }

    //segSocio():long
    //consSocio(): string
}
