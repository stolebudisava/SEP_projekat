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
@Table(name = "home_insurances")

public class HomeInsurance implements IInsuranceType{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(nullable = false, length = 20)
    private double floorArea;

    @Column(nullable = false, length = 20)
    private Date starts;
    
    @Column(nullable = false, length = 20)
    private Date ends;

    @Column(nullable = false, length = 20)
    private IInsuranceType type;
    
    @Column(nullable = false, length = 20)
    private String address;
    
    @Column(nullable = false, length = 20)
    private String owner;
    
    @Column(nullable = false, length = 20)
    private Long JMBG;
    
    protected HomeInsurance() {} // required for ORM mapping

    
	public HomeInsurance(Long id, double floorArea, Date starts, Date ends, IInsuranceType type, String address,
			String owner, Long jMBG) {
		super();
		this.id = id;
		this.floorArea = floorArea;
		this.starts = starts;
		this.ends = ends;
		this.type = type;
		this.address = address;
		this.owner = owner;
		JMBG = jMBG;
	}
	
	
	 public void amount() {
			// TODO Auto-generated method stub
			
		}





}
