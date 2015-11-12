package org.gwtproject.tutorial.client;

// GWT core stuff:
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
// Vaadin polymer elements:
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.paper.element.PaperCheckboxElement;

public class Item {

  private final DivElement element;

  interface ItemUiBinder extends UiBinder<DivElement, Item> {}

  private static ItemUiBinder ourUiBinder = GWT.create(ItemUiBinder.class);

  @UiField
  Element title; // <span>
  @UiField
  Element description; // <div>
  @UiField
  PaperCheckboxElement done; // <paper-checkbox>

  public Item() {
    element = ourUiBinder.createAndBindUi(this);

    // When the "done" checkbox changes...
    done.addEventListener("iron-change", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        // Add/remove .done class to it
        if (done.getActive()) {
          title.addClassName("done");
        } else {
          title.removeClassName("done");
        }
      }
    });
  } // end Item()

  public String getTitle() {
    return title.getInnerText();
  }

  public void setTitle(String s) {
    title.setInnerText(s);
  }

  public String getDescription() {
    return description.getInnerText();
  }

  public void setDescription(String s) {
    description.setInnerText(s);
  }

  public boolean isDone() {
    return done.getActive();
  }

  public void setDone(boolean b) {
    done.setActive(b);
  }

  public DivElement getElement() {
    return element;
  }
} // end class Item
