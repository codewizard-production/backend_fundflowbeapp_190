package com.app.fundflowbeapp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "StartupFounders")
@Table(schema = "\"fundflowbeapp\"", name = "\"StartupFounders\"")
@Data
public class StartupFounders{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"FId\"")
    private Integer fId;
 
}