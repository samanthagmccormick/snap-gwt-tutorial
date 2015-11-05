### About the App
Created with webAppCreator, a command line tool included in GWT that generates the project subdirectories and files you need to get started. It creates a starter application.

## Directories

* **/src/com/google/gwt/sample/TodoListApp** Contains the GWT module definition and initial application files.
* **/test/com/google/gwt/sample/TodoListApp** Contains JUnit test directory and a starter test class.
* **/war** Contains static resources that can be served publicly, such as image files, style sheets, and HTML host pages.
* **/war/WEB-INF** Contains Java web application files.
* **/war/WEB-INF/lib** Contains Java web application libraries.

## Files

* **TodoList.gwt.xml** = GWT module definition
* **TodoList.java** = Entry Point:

  * The entry point contains onModuleLoad() methods. It contains the code that executes when you launch the application. Typically, the types of things you do in the onModuleLoad() method are:
   * create new user interface components
   * set up handlers for events
   * modify the browser DOM in some way

* **TodoList.html** = Host page
* **TodoList.css** = Style sheet
* **web.xml** = Java web application descriptor
* **GreetingService.java, GreetingServiceAsync.java, GreetingServiceImpl.java** = GWT sample RPC classes
* **gwt-servlet.jar** = GWT server runtime library


### Link to Tutorial
http://www.gwtproject.org/doc/latest/polymer-tutorial/create.html

### Start the server in SuperDevMode
 * $ cd TodoListApp
 * $ mvn war:exploded
 * $ mvn gwt:run

### Launch the browser
 * In the GWT developer window, press "Launch Default Browser"
 * If you change something in the code, you can recompile the application by simply reloading the web page
 * If you change configuration files, e.g. pom.xml or static content in webapp, you might have to restart SuperDevMode. Ctrl+C and mvn gwt:run stops and starts the execution, respectively.