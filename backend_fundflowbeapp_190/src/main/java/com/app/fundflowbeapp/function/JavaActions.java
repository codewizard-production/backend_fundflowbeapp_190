package com.app.fundflowbeapp.function;

import com.app.fundflowbeapp.model.Stage;
import com.app.fundflowbeapp.model.Startup;
import com.app.fundflowbeapp.model.FundingRound;
import com.app.fundflowbeapp.model.Founder;
import com.app.fundflowbeapp.model.Document;
import com.app.fundflowbeapp.model.Investor;




import com.app.fundflowbeapp.enums.RoundStatus;
import com.app.fundflowbeapp.enums.StageName;
import com.app.fundflowbeapp.converter.StageNameConverter;
import com.app.fundflowbeapp.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  