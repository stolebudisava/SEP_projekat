package com.devtechgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "cardId")
@ToString
@Entity
@Table(name = "credit_cards")
public class CreditCard {
	
	  	@Id
	    private Long cardId;

	    @Column(nullable = false, length = 100)
	    private String owner;

	    @Column(nullable = false, length = 100)
	    private String expireDate;
	    
	    @Column(nullable = false, length = 100)
	    private String secureNum;

	    protected CreditCard() {} // required for ORM mapping

		public CreditCard(Long cardId, String owner, String expireDate, String secureNum) {
			super();
			this.cardId = cardId;
			this.owner = owner;
			this.expireDate = expireDate;
			this.secureNum = secureNum;
		} 
	    
}
