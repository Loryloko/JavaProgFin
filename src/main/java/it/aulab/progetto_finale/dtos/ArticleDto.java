package it.aulab.progetto_finale.dtos;

import java.time.LocalDate;
import java.util.Locale.Category;

import it.aulab.progetto_finale.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String title;
    private String subtitle;
    private String body;
    private LocalDate publishDate;
    private User user;
    private Category category;
}
