/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions;

import java.util.LinkedList;

/**
 *
 * @author Marc
 */
public class Impressora {
        private LinkedList<Document> documents;
           
         public Impressora() {
        documents = new LinkedList<>();
    }   
        public boolean empty() {
        return documents.isEmpty();
    }

    public void addDocument(Document e) {
        documents.addLast(e);
    }

    public Object impimirDocument() {
        if (!this.empty()) {
            return documents.removeFirst();
        } else {
            return null;
        }
    }
}

