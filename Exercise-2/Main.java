public class Main {

    public static void main(String[] args) {

        Document doc1 = DocumentFactory.createDocument("WORD");
        doc1.open();

        Document doc2 = DocumentFactory.createDocument("PDF");
        doc2.open();

        Document doc3 = DocumentFactory.createDocument("EXCEL");
        doc3.open();
    }
}