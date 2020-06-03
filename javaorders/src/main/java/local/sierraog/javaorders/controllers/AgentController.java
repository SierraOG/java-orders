package local.sierraog.javaorders.controllers;

import local.sierraog.javaorders.models.Agent;
import local.sierraog.javaorders.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AgentController {
    @Autowired
    private AgentService agentService;

    @GetMapping(value = "/agent/{id}",
            produces = {"application/json"})
    public ResponseEntity<?> listAgentWithId(
            @PathVariable
                    int id
    )
    {
        Agent myAgent = agentService.findAgentWithId(id);
        return new ResponseEntity<>(myAgent,
                HttpStatus.OK);
    }
}
