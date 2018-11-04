package com.efact.action;

import com.efact.dao.factory.DaoFactory;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.efact.util.ExcelExport;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.efact.bean.*;

public class NoteDebitAction extends ActionSupportBase implements ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private InputStream excelStream;
	private List<Program> listProgram;
	private List<Group> listGroup;
	private List<NoteDebitDropdown> listNoteDebitDropdown;
	private List<NoteDebit> listNoteDebit;
	private NoteDebit noteDebit;
	
	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	
    public NoteDebitAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String index() throws Exception {
		
		ProgramDao productDao = dao.getProgramDao();
		GroupDao groupDao = dao.getGroupDao();
		
		listProgram = productDao.findAll();
		listGroup = groupDao.findAll();
		
		return SUCCESS;
	}
	
	public String dropdown() throws Exception {

        int programId = Integer.valueOf(request.getParameter("programId"));
        int groupId = Integer.valueOf(request.getParameter("groupId"));

        NoteDebitDao noteDebitDao = dao.getNoteDebitDao();
        listNoteDebitDropdown = noteDebitDao.listNoteDebitDropdown(programId, groupId);
        
		return SUCCESS;
	}
	
	public String search() throws Exception {
		
        String fields = request.getParameter("fields");
        NoteDebit noteDebit = gson.fromJson(serializeToJSON(fields), NoteDebit.class);
        
        NoteDebitDao noteDebitDao = dao.getNoteDebitDao();
        listNoteDebit = noteDebitDao.search(noteDebit);
		
		return SUCCESS;
	}

	public String export() throws Exception {
		
        String fields = request.getParameter("fields");
        NoteDebit noteDebit = gson.fromJson(serializeToJSON(fields), NoteDebit.class);
        
        NoteDebitDao noteDebitDao = dao.getNoteDebitDao();
        listNoteDebit = noteDebitDao.search(noteDebit);
        
		this.excelStream = ExcelExport.noteDebitExport(listNoteDebit);
		
		return SUCCESS;
	}
	
	public String process() throws Exception {
		
        String fields = request.getParameter("fields");
        NoteDebit nbObj = gson.fromJson(serializeToJSON(fields), NoteDebit.class);

        NoteDebitDao noteDebitDao = dao.getNoteDebitDao();
        noteDebit = noteDebitDao.process(nbObj); 
        
		return SUCCESS;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public List<Program> getListProgram() {
		return listProgram;
	}

	public void setListProgram(List<Program> listProgram) {
		this.listProgram = listProgram;
	}

	public List<Group> getListGroup() {
		return listGroup;
	}

	public void setListGroup(List<Group> listGroup) {
		this.listGroup = listGroup;
	}

	public List<NoteDebit> getListNoteDebit() {
		return listNoteDebit;
	}

	public void setListNoteDebit(List<NoteDebit> listNoteDebit) {
		this.listNoteDebit = listNoteDebit;
	}
	
	public InputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(InputStream excelStream) {
		this.excelStream = excelStream;
	}

	public List<NoteDebitDropdown> getListNoteDebitDropdown() {
		return listNoteDebitDropdown;
	}

	public void setListNoteDebitDropdown(List<NoteDebitDropdown> listNoteDebitDropdown) {
		this.listNoteDebitDropdown = listNoteDebitDropdown;
	}

	public NoteDebit getNoteDebit() {
		return noteDebit;
	}

	public void setNoteDebit(NoteDebit noteDebit) {
		this.noteDebit = noteDebit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
