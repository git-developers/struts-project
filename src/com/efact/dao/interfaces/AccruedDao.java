package com.efact.dao.interfaces;

import java.sql.Date;
import java.util.List;
import com.efact.bean.*;

public interface AccruedDao {

	public List<Accrued> search(
			int programId,
			int groupId,
			int bankId,
			String voucher,
			int status, 
		    Date from,    
		    Date to
    ) throws Exception;
	
	public int getSequence() throws Exception;
	
	public int insertVoucher(Accrued voucher, int nlote) throws Exception;
	
	public int generateVoucher(int nlote) throws Exception;
	
	public Accrued findOneById(String id) throws Exception;
	
}
