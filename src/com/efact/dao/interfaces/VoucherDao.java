package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface VoucherDao {

	public List<Voucher> search(Voucher object) throws Exception;
	
	public int getSequence() throws Exception;
	
	public int insertVoucher(Voucher voucher, int nlote) throws Exception;
	
	public List<Voucher> generateVoucher(int nlote) throws Exception;
	
	public List<VoucherDropdown> listVoucherDropdown(int option) throws Exception;
	
}
