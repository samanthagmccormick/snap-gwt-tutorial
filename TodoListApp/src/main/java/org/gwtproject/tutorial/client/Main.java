package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.paper.element.PaperButtonElement;
import com.vaadin.polymer.paper.element.PaperDialogElement;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.element.PaperFabElement;
import com.vaadin.polymer.paper.element.PaperInputElement;
import com.vaadin.polymer.paper.element.PaperTextareaElement;

    public class Main extends Composite {
      interface MainUiBinder extends UiBinder<HTMLPanel, Main> {
      }
      
      // create your first widget ourUiBinder using the MainUiBinder class
      private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
      
      // All the ui:field 's inside Main.ui.xml
      @UiField PaperDialogElement addItemDialog; // <paper-dialog>
      @UiField PaperInputElement titleInput; // <paper-input>
      @UiField PaperTextareaElement descriptionInput; // <paper-textarea>
      @UiField PaperButtonElement confirmAddButton; // <paper-button>
      
      @UiField PaperDrawerPanelElement drawerPanel; // <paper-drawer-panel>
      @UiField HTMLElement content; // <div>
      @UiField PaperFabElement addButton; // <paper-fab>

      public Main() {
        initWidget(ourUiBinder.createAndBindUi(this));

        addButton.addEventListener("click", new EventListener() {
          @Override
          public void handleEvent(Event event) {
            GWT.log("Clicked", null);
            addItemDialog.open();
          }
        });
      } /* end Main() */
    }