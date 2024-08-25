package lesson6.notes.presentation.queries.views;

import lesson6.notes.application.interfaces.NotesPresenter;
import lesson6.notes.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

}
