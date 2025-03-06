package br.com.acme.beerfact.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@Entity
@Table(name = "MARCAS")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    @Size(min = 2, max = 30,message = "O nome do pais deve ter entre 2 e 30")
    private String pais;
    //@Column(name = "emailFornecedor")
    @Email(message = "O email deve ser um email valido")
    private String email;
    @Past(message = "A Data é invalida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFundacao;
}
