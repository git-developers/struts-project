package com.efact.dao.interfaces;

import java.sql.Date;
import java.util.List;
import com.efact.bean.*;

public interface AccruedDao {

	public List<Accrued> search(
		    Date from,    
		    Date to
    ) throws Exception;
	

	public int generateVoucher(int nlote) throws Exception;

	
}
