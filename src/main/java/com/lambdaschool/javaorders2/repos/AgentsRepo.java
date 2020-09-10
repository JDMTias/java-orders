package com.lambdaschool.javaorders2.repos;

import com.lambdaschool.javaorders2.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepo extends CrudRepository<Agent, Long> {

}
