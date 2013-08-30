package org.alc.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.skyrat.BinaryReadWrite;
import org.skyrat.TransBody;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.UploadEvent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelArray;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Menuitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Vbox;
import org.zkoss.zul.Window;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class FileAnalyzerController extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7948775482135868770L;
	private BinaryReadWrite brw = null;
	private List<TransBody> trans_list;
	
	@Wire
	private Menuitem newbee;
	
	@Wire
	private Listbox tdList;
	
	private Window decryptWin;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		System.out.println("Initializing...");
	}
	
	@Listen("onUpload = #open")
	public void analyzeFile(UploadEvent event) {
		System.out.println("File upload finished, start to analyze...");
//		byte[] bytes;
//		bytes = event.getMedia().getByteData();
//		String str = new String(bytes);
//		System.out.println(str);
		if (event.getMedia().isBinary()) {
			System.out.println("Upload is binary...");
			brw = new BinaryReadWrite(event.getMedia().getStreamData());
		} else {
			System.out.println("Upload is not binary...");
			brw = new BinaryReadWrite(new ByteArrayInputStream(event.getMedia().getStringData().getBytes()));
		}
		
		// read header
		if (brw.readFileHeader()) {
			if (brw.mac_code_in.equals("1") 
                    || brw.mac_code_in.equals("2")) {
				// show decrypt code window
				showDecryptWin();
			}
			brw.readFileBody();
		}
		// brw.print();
		if(brw.read_success_flag == false){
			Messagebox.show("IC卡脱机上传文件解析工具 解析出错", "Error",
                    Messagebox.OK, Messagebox.ERROR);
        }
		trans_list = brw.trans_list;
		System.out.println(brw.trans_list.get(0));
		System.out.println(brw.trans_list.get(0).getTerm_id());
		// Set Model to make client re-render listbox
		tdList.setModel(new ListModelList<TransBody>(brw.trans_list));
	}
	
	@Listen("onOpen = #mp")
	void popupMenu() {
		System.out.println("Poping up menu...");
	}
	
	@Listen("onMaximize")
	void maximize() {
		System.out.println("maximizing...");
	}
	
	public void showDecryptWin() {
		decryptWin.setWidth("250px");
		decryptWin.setHeight("80px");
		decryptWin.setClosable(true);
		decryptWin.setTitle("POS终端主密匙");
		
		Vbox vbox = new Vbox();
		
		Label lbInput = new Label();
		Textbox tbCode = new Textbox();
		Hbox boxBtn = new Hbox();
		lbInput.setValue("报文已加密，请输入POS终端主密匙：");
		lbInput.setParent(vbox);		
		tbCode.setParent(vbox);
		Button btnOk = new Button("确认");
		Button btnCancel = new Button("取消");
		
		btnOk.addEventListener(Events.ON_CLICK, new EventListener<Event>() {

			@Override
			public void onEvent(Event event) throws Exception {
				// TODO Auto-generated method stub
				
			}
			
		});
		btnCancel.setType("cancel");
		boxBtn.appendChild(btnOk);
		boxBtn.appendChild(btnCancel);
		
	}

	public List<TransBody> getTrans_list() {
		return trans_list;
	}

	public void setTrans_list(List<TransBody> trans_list) {
		this.trans_list = trans_list;
	}

}
