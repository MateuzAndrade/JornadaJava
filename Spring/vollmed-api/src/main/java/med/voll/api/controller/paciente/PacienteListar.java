package med.voll.api.controller.paciente;

import med.voll.api.model.paciente.Paciente;

public record PacienteListar(String nome, String email, String CPF) {

    public PacienteListar (Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCPF());
    }

}
