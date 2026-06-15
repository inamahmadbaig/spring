package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Interface.Bank;
import com.Interface.BankFactory;


@Component
public class ConcreteBankFactory implements BankFactory{
	@Autowired
	SBI sbi;
	@Autowired
	HDFC hdfc;
	@Override
	
	public Bank createBank(String bankType) {

        if (bankType.equalsIgnoreCase("SBI")) {
            return sbi;
        } else if (bankType.equalsIgnoreCase("HDFC")) {
            return hdfc;
        }

        throw new IllegalArgumentException("Invalid bank type: " + bankType);
		
	}
	
	
}
