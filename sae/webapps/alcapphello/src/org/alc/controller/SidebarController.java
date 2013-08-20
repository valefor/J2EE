package org.alc.controller;

import org.alc.services.SidebarPage;
import org.alc.services.SidebarPageConfig;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.SerializableEventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Image;
import org.zkoss.zul.Include;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class SidebarController extends SelectorComposer<Component> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	Grid fnList;
	
	@WireVariable("sidebarPageConfig")
	SidebarPageConfig pageConfig;
//	SidebarPageConfig pageConfig = new SidebarPageConfigImpl();
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		Rows rows = fnList.getRows();
		
		for(SidebarPage page:pageConfig.getPages()) {
			Row row = constructSidebarRow(page.getName(),page.getLabel(),page.getIconUri(),page.getUri());
			rows.appendChild(row);
		}
	}

	private Row constructSidebarRow(final String name, String label, String iconUri,
			final String locationUri) {
		Row row = new Row();
		Image img = new Image(iconUri);
		Label lab = new Label(label);

		
		row.appendChild(img);
		row.appendChild(lab);
		
		row.setSclass("sidebar-fn");

//		System.out.println(iconUri);
		
		EventListener<Event> onActionListener = new SerializableEventListener<Event>(){
            private static final long serialVersionUID = 1L;
 
            public void onEvent(Event event) throws Exception {
                //redirect current url to new location
                if(locationUri.startsWith("http")){
                    //open a new browser tab
                    Executions.getCurrent().sendRedirect(locationUri);
                }else{
                    //use iterable to find the first include only
//                    Include include = (Include)Selectors.iterable(fnList.getPage(), "#mainInclude")
//                    		.iterator().next();
//                    include.setSrc(locationUri);
                    
                    //advance bookmark control, 
					//bookmark with a prefix
//					if(name!=null){
//						getPage().getDesktop().setBookmark("p_"+name);
//					}
                }
            }
        };      
        row.addEventListener(Events.ON_CLICK, onActionListener);
		
        
		return row;
		
	}
	


}
