package br.com.acme.beerfact.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@Entity
public class Cerveja {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne(fetch = FetchType.EAGER)
    private Estilo estilo;
    @ManyToOne(fetch = FetchType.LAZY)
    private Marca marca;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Lupulo> lupulos;
}
