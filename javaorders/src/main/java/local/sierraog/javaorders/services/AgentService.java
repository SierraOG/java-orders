package local.sierraog.javaorders.services;

import local.sierraog.javaorders.models.Agent;
import local.sierraog.javaorders.models.Customer;

public interface AgentService {
    Agent findAgentWithId(long id);
}
