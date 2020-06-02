package local.sierraog.javaorders.services;

import local.sierraog.javaorders.models.Agent;
import local.sierraog.javaorders.models.Customer;
import local.sierraog.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceImpl
    implements AgentService
{
    @Autowired
    private AgentRepository agentrepos;

    @Override
    public Agent findAgentWithId(long id)
    {
        return agentrepos.findByIdContainingIgnoreCase(id);
    }

}
