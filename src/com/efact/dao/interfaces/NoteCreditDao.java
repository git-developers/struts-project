package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface NoteCreditDao {
	
	public NoteCredit search(NoteCredit noteCredit) throws Exception;
	
	public List<NoteCreditType> listNoteCreditType() throws Exception;
	
}
