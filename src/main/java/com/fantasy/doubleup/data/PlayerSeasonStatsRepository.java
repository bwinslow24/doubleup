package com.fantasy.doubleup.data;

import com.fantasy.doubleup.data.JPA.PlayerSeasonStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface PlayerSeasonStatsRepository extends JpaRepository<PlayerSeasonStats, Integer> {

    List<PlayerSeasonStats> getPlayerSeasonStatsByPlayerId(Integer id);
}
