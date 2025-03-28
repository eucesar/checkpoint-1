package br.com.fiap.checkpoint1.dto;

import br.com.fiap.checkpoint1.model.Paciente;

public class PacienteResponse {
    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefoneCompleto;

    public PacienteResponse toDto(Paciente paciente) {
        this.setId(paciente.getId());
        this.setNome(paciente.getNome());
        this.setEndereco(paciente.getEndereco());
        this.setBairro(paciente.getBairro());
        this.setEmail(paciente.getEmail());
        this.setTelefoneCompleto(paciente.getTelefoneCompleto());
        return this;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefoneCompleto() {
        return telefoneCompleto;
    }
    public void setTelefoneCompleto(String telefoneCompleto) {
        this.telefoneCompleto = telefoneCompleto;
    }
}
