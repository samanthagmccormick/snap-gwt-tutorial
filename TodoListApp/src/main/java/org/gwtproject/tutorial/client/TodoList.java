package org.gwtproject.tutorial.client;

import java.util.Arrays;

/* Implement this interface to allow a class to act as a module entry point. */
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
/* The panel to which all other widgets must ultimately be added. */
import com.google.gwt.user.client.ui.RootPanel;
/* GWT Polymer Elements - Paper Button (Material Design) */
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.paper.element.PaperButtonElement;
import com.vaadin.polymer.paper.element.PaperCheckboxElement;
import com.vaadin.polymer.paper.element.PaperDialogElement;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.element.PaperFabElement;
import com.vaadin.polymer.paper.element.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.element.PaperIconButtonElement;
import com.vaadin.polymer.paper.element.PaperIconItemElement;
import com.vaadin.polymer.paper.element.PaperInputElement;
import com.vaadin.polymer.paper.element.PaperRippleElement;
import com.vaadin.polymer.paper.element.PaperTextareaElement;
import com.vaadin.polymer.paper.element.PaperToolbarElement;

/**
 * Entry point classes define onModuleLoad().
 */

public class TodoList implements EntryPoint {

  /**
   * This is the entry point method. Initialize you GWT module here.
   */

  /*
   * Tip: to facilitate the usage of webcomponents gwt-polymer-elements maintains a couple of static
   * constants: Element.TAG and Element.SRC, to avoid memorizing tag names and import paths
   * respectively
   */

  @Override
  public void onModuleLoad() {

    // Writes Hello World to the module log window.
    GWT.log("Hello World!", null);

    Polymer
        .importHref(Arrays
            .asList(
            // We have to load icon sets
            "iron-icons/iron-icons.html",
            // And we have to load all web components in our application
            // before using them as custom elements.
            PaperDrawerPanelElement.SRC, PaperHeaderPanelElement.SRC, PaperToolbarElement.SRC, PaperIconItemElement.SRC, PaperRippleElement.SRC, PaperIconButtonElement.SRC, PaperFabElement.SRC, PaperDialogElement.SRC, PaperInputElement.SRC, PaperTextareaElement.SRC, PaperCheckboxElement.SRC, PaperButtonElement.SRC), new Function() {
          @Override
          public Object call(Object arg) {
            // The app is executed when all imports succeed.
            startApplication();
            return null;
          }
        });
  }

  /* Load the main screen */
  private void startApplication() {
    RootPanel.get().add(new Main());
  }

} // end class ToDoList EntryPoint
