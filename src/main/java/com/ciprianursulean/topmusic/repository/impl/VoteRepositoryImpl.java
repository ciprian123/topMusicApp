package com.ciprianursulean.topmusic.repository.impl;

import com.ciprianursulean.topmusic.model.Vote;
import com.ciprianursulean.topmusic.repository.VoteRepository;
import com.ciprianursulean.topmusic.util.PersistenceUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class VoteRepositoryImpl implements VoteRepository {
    EntityManagerFactory entityManagerFactory = PersistenceUtil.getInstance().getEntityManagerFactory();

    @Override
    public List<Vote> getAllVotes() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Vote> result = entityManager.createNamedQuery("getAllVotes").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }

    @Override
    public boolean addVote(int userId, int songId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Vote vote = (Vote) entityManager.createNamedQuery("findVoteWithInfoGiven").setParameter("userId", userId).setParameter("songId", songId).getSingleResult();
        if (vote == null) {
            return false;
        }
        vote = new Vote(userId, songId, System.currentTimeMillis());
        entityManager.persist(vote);
        entityManager.getTransaction().commit();
        entityManager.clear();
        return true;
    }

    @Override
    public boolean updateVote(int userId, int songId) {
        return false;
    }

    @Override
    public boolean deleteVote(int userId, int songId) {
        return false;
    }
}
