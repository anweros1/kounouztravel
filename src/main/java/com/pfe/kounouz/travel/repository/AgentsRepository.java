package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Agents;

@Repository
public interface AgentsRepository extends JpaRepository<Agents, Long> {

	Agents findOneAgentById(Long id);

}
