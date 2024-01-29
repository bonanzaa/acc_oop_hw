# Object Oriented Design Pattern example project

The sample project is a mock-up of an image/text document management system, and illustrates the implementation of various deisgn patterns.

## Design patterns implemented:
- **Factory Pattern:** ```DocumentFactory``` is the factory interface, and ```TextDocumentFactory``` and ```ImageDocumentFactory``` are concrete factories, creating ```TextDocument``` and ```ImageDocument``` instances.
- **Command Pattern:** ```OpenDocumentCommand``` and ```SaveDocumentCommand``` encapsulate the ```open``` and ```save``` operations as objects.
- **Observer Pattern:** ```StatusBar``` acts as an observer to the ```ImageDocument``` and ```TextDocument``` classes, and is notified whenever a document ir opened/saved.
- **Adapter Pattern:** ```DocumentAdapter``` adapts the ```Document``` interface to the ```Command``` Interface, allowing a document to be executed as a command.
- **Composite Pattern:** ```MacroCommand``` represents a composite command, that can execute multiple commands at the same time - opening/saving a document, or adapting it.
