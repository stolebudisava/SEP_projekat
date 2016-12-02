package ftn.uns.ac.rs.tim2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
@Table(name = "travelinsurances")


public class TravelInsurance implements IInsuranceType{
	
	public enum InsurancePackage{
		TOWING, FIXING, ACCOMODATION, ALTERNATIVE_RIDE
	}
	
	public enum InsuranceType{
		STEAL, FLOOD, FIRE, ALL
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 20)
    private Date starts;
    
    @Column(nullable = false, length = 20)
    private Date ends;

    @Column(nullable = false, length = 20)
    private InsuranceType type;
    
    @Column(nullable = false, length = 20)
    private InsurancePackage pack;
    
    @Column(nullable = false, length = 20)
    private String carBrand;
    
    @Column(nullable = false, length = 20)
    private String carType;
    
    @Column(nullable = false, length = 20)
    private String carLicencePlate;
    
    @Column(nullable = false, length = 20)
    private String carChasisNum;
    
    @Column(nullable = false, length = 20)
    private String owner;
    
    @Column(nullable = false, length = 20)
    private Long JMBG;
    
    protected TravelInsurance() {} // required for ORM mapping

	public TravelInsurance(Long id, Date starts, Date ends, InsuranceType type, InsurancePackage pack, String carBrand,
			String carType, String carLicencePlate, String carChasisNum, String owner, Long jMBG) {
		super();
		this.id = id;
		this.starts = starts;
		this.ends = ends;
		this.type = type;
		this.pack = pack;
		this.carBrand = carBrand;
		this.carType = carType;
		this.carLicencePlate = carLicencePlate;
		this.carChasisNum = carChasisNum;
		this.owner = owner;
		this.JMBG = jMBG;
	} 
	
	public void amount() {
		// TODO Auto-generated method stub
		
	}
    
    

}
