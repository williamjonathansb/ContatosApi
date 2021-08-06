package br.fcamara.com.ContatosApi.controller.form;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ContatoeEnderecoForm {

    @Valid
    private ContatoForm contatoForm;
    private EnderecoForm enderecoForm;

    public ContatoForm getContatoForm() {
        return contatoForm;
    }

    public void setContatoForm(ContatoForm contatoForm) {
        this.contatoForm = contatoForm;
    }

    public EnderecoForm getEnderecoForm() {
        return enderecoForm;
    }

    public void setEnderecoForm(EnderecoForm enderecoForm) {
        this.enderecoForm = enderecoForm;
    }
}
