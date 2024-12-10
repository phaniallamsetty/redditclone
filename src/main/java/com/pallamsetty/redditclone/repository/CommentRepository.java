package com.pallamsetty.redditclone.repository;

import com.pallamsetty.redditclone.model.Comment;
import com.pallamsetty.redditclone.model.Post;
import com.pallamsetty.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
}
