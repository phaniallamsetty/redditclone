package com.pallamsetty.redditclone.repository;

import com.pallamsetty.redditclone.model.Post;
import com.pallamsetty.redditclone.model.User;
import com.pallamsetty.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
