package com.example.ClientManagerAPI.DTO;

import com.example.ClientManagerAPI.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;

    @Size(min = 3, max = 80, message = "Nome precisa ter entre 3 e 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Size(min = 11, max = 11, message = "Cpf deve ter 11 caracteres")
    @NotBlank(message = "Campo requerido")
    private String cpf;

    @Positive(message = "Salário deve ser positivo")
    private Double income;

    @PastOrPresent
    private LocalDate birthDate;

    @Positive(message = "Quantidade precisa ser positivo")
    private Integer children;

    public ClientDTO() { }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthDate = client.getBirthDate();
        this.children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
