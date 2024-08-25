package lesson6;

import lesson6.database.NotesDatabase;
import lesson6.notes.application.ConcreteNoteEditor;
import lesson6.notes.domain.Note;
import lesson6.notes.infrastructure.persistance.DatabaseContext;
import lesson6.notes.presentation.queries.controllers.NotesController;
import lesson6.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NotesController notesController = new NotesController(
                new ConcreteNoteEditor(new NotesConsolePresenter(), new DatabaseContext(new NotesDatabase())));

        notesController.routeAddNote(new Note("test", "testing"));
        notesController.routeAddNote(new Note("task", "some details"));

        notesController.routeGetAll();

        notesController.routeRemoveNote(8);
        notesController.routeRemoveNote(23);

        notesController.routeGetAll();


    }

}
