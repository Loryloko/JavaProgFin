package it.aulab.progetto_finale.models;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// IMPORTA ESPLICITAMENTE LA TUA CLASSE CATEGORY (Risolve il crash di Hibernate)
import it.aulab.progetto_finale.models.Category; 

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotEmpty
    @Size(max = 100)
    private String title;

    @Column(nullable = false, length = 1000)
    @NotEmpty
    @Size(max = 1000)
    private String subtitle;

    @Column(nullable = false, length = 1000)
    @NotEmpty
    @Size(max = 1000)
    private String body;

    @Column(nullable = true)
    @NotNull
    private LocalDate publishDate;

    @ManyToOne
    @JsonIgnoreProperties({"articles"})
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
