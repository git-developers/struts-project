package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface NoteDebitDao {
	
	public List<NoteDebit> search(NoteDebit object) throws Exception;
	
	public NoteDebit process(NoteDebit object) throws Exception;
	
	public List<NoteDebitDropdown> listNoteDebitDropdown(int programId, int groupId) throws Exception;
}
