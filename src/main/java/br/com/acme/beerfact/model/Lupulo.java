package br.com.acme.beerfact.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@Entity
public class Lupulo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 100, message = "O tamanho excede o limite do campo")
    private String nome;
    @Size(max = 5000, message = "O tamanho excede o limite do campo")
    private String descricao;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Cerveja> cervejas;
}
