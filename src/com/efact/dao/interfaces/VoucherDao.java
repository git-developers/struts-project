package com.efact.dao.interfaces;

import java.sql.Date;
import java.util.List;
import com.efact.bean.*;

public interface VoucherDao {

	public List<Voucher> search(
			int programId,
			int groupId,
			int bankId,
			String voucher,
			int status, 
		    Date from,    
		    Date to
    ) throws Exception;
	
	public Integer getSecuencia() throws Exception;
	
	public Voucher findOneById(String id) throws Exception;
	
}
