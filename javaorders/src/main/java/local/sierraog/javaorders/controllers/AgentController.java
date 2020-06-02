package local.sierraog.javaorders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AgentController {
    @Autowired
    private AgentService agentService;

    @GetMapping(value = "/agent/{id}")
    public ResponseEntity<?> listAgentWithId(
            @PathVariable
                    int id
    )
    {
        Customer myAgent = orderService.findAgentWithId(id);
        return new ResponseEntity<>(myAgent,
                HttpStatus.OK);
    }
}
