package med.voll.api.model.medico;

public record MedicoListar( String nome, String email, String CRM, Especialidade especialidade) {

    public MedicoListar (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCRM(), medico.getEspecialidade());
    }
}
