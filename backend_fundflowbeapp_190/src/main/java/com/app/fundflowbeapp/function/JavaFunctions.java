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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.fundflowbeapp.repository.FundingRoundRepository;
import com.app.fundflowbeapp.repository.StageRepository;
import com.app.fundflowbeapp.repository.DocumentRepository;
import com.app.fundflowbeapp.repository.InvestorRepository;
import com.app.fundflowbeapp.repository.FounderRepository;
import com.app.fundflowbeapp.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
