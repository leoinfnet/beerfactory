package br.com.acme.beerfact.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter@Setter@AllArgsConstructor@Builder@NoArgsConstructor
@Entity
public class Estilo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
