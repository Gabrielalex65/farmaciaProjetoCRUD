package EngProjeto.farmacia.model;

import javax.persistence.*;

@Entity
@Table(name = "receitas")
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nome_paciente")
    private String nomePaciente;
    @Column(name = "nome_medico")
    private String nomeMedico;
    @Column(name = "crm_medico")
    private String crmMedico;
    @Column(name = "medicamento_nome")
    private String medicamento;
    @Column(name = "quantidade_medicamento")
    private int quantidadeMedicamento;
    @Column(name = "codigo_ministerio_saude_medicamento")
    private String codigoMinisterioSaudeMedicamento;

    public Receita() {

    }
    public Receita(String nomePaciente, String nomeMedico, String crmMedico, String medicamento, int quantidadeMedicamento, String codigoMinisterioSaudeMedicamento) {
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.crmMedico = crmMedico;
        this.medicamento = medicamento;
        this.quantidadeMedicamento = quantidadeMedicamento;
        this.codigoMinisterioSaudeMedicamento = codigoMinisterioSaudeMedicamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getQuantidadeMedicamento() {
        return quantidadeMedicamento;
    }

    public void setQuantidadeMedicamento(int quantidadeMedicamento) {
        this.quantidadeMedicamento = quantidadeMedicamento;
    }

    public String getCodigoMinisterioSaudeMedicamento() {
        return codigoMinisterioSaudeMedicamento;
    }

    public void setCodigoMinisterioSaudeMedicamento(String codigoMinisterioSaudeMedicamento) {
        this.codigoMinisterioSaudeMedicamento = codigoMinisterioSaudeMedicamento;
    }
}
