package me.eatnows.lectureboard.repository;

import me.eatnows.lectureboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
