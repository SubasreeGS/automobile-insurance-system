package com.helpdesk.service;

import com.helpdesk.model.Executive;
import com.helpdesk.repository.ExecutiveRepository;
import org.springframework.stereotype.Service;

@Service
public class ExecutiveService {
    private final ExecutiveRepository executiveRepository;

    public ExecutiveService(ExecutiveRepository executiveRepository) {
        this.executiveRepository = executiveRepository;
    }
    public void insertExecutive(int managerId, Executive executive, String username, String password)
    {
        //step 1: Prepare User onject

        //Step 2: Fetch Manager object from DB using managerID

        //step 3: Attach user and manager to executive

        //step 4: pass executive to ExecutiveREpository
    }
}
