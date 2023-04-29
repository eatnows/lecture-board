package me.eatnows.lectureboard.repository;

import me.eatnows.lectureboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}
