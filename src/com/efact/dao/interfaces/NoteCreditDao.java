package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface NoteCreditDao {
	
	public NoteCredit search(NoteCredit object) throws Exception;
	
	public NoteCredit process(NoteCredit object) throws Exception;
	
	public List<NoteCreditType> listNoteCreditType() throws Exception;
	
	public List<Series> listSeries() throws Exception;
	
}
